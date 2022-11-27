package fr.isika.al17.raiddonspringserver.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import fr.isika.al17.raiddonspringserver.constant.FileConstant;
import fr.isika.al17.raiddonspringserver.constant.SecurityConstant;
import fr.isika.al17.raiddonspringserver.exception.EmailExistsException;
import fr.isika.al17.raiddonspringserver.exception.ExceptionHandling;
import fr.isika.al17.raiddonspringserver.exception.NotAnImageFileException;
import fr.isika.al17.raiddonspringserver.exception.UserNotFoundException;
import fr.isika.al17.raiddonspringserver.exception.UsernameExistsException;
import fr.isika.al17.raiddonspringserver.models.CustomUserDetails;
import fr.isika.al17.raiddonspringserver.models.HttpResponse;
import fr.isika.al17.raiddonspringserver.models.User;
import fr.isika.al17.raiddonspringserver.service.UserService;
import fr.isika.al17.raiddonspringserver.utils.JwtUtility;


@RestController
@RequestMapping(value = { "/", "/user" })
@CrossOrigin(origins = "*")
public class UserController extends ExceptionHandling {

    public static final String USER_DELETED_SUCCESSFULLY = "User deleted successfully.";
    public static final String EMAIL_SENT = "An email with a new password was sent to: ";
    private UserService userService;
    private AuthenticationManager authenticationManager;
    private JwtUtility jwtUtility;

    @Autowired
    public UserController(UserService userService, AuthenticationManager authenticationManager, JwtUtility jwtUtility) {
	this.userService = userService;
	this.authenticationManager = authenticationManager;
	this.jwtUtility = jwtUtility;
    }
    
    @PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user) throws UserNotFoundException, UsernameExistsException, EmailExistsException, MessagingException {
		User newUser = userService.register(
				user.getFirstname(), 
				user.getLastname(),
				user.getUsername(),
				user.getEmail());
		return new ResponseEntity<User>(newUser, HttpStatus.OK);
	}

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
	authenticate(user.getUsername(), user.getPassword());
	User loginUser = userService.findByUsername(user.getUsername());
	CustomUserDetails customUserDetails = new CustomUserDetails(loginUser);
	HttpHeaders jwtHeaders = getJwtHeader(customUserDetails);
	return new ResponseEntity<User>(loginUser, jwtHeaders, HttpStatus.OK);
    }


    @PostMapping("/add")
    @PreAuthorize("hasAnyAuthority('user:create')")
    public ResponseEntity<User> addNewUser(@RequestParam("firstname") String firstName,
	    @RequestParam("lastname") String lastName, @RequestParam("userName") String userName,
	    @RequestParam("email") String email, @RequestParam("role") String role,
	    @RequestParam("isActive") String isActive, @RequestParam("isNotLocked") String isNotLocked,
	    @RequestParam(value = "profileImage", required = false) MultipartFile profileImage)
	    throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException,
	    NotAnImageFileException, MessagingException {
	User newUser = userService.addNewUser(firstName, lastName, userName, email, role,
		Boolean.parseBoolean(isNotLocked), Boolean.parseBoolean(isActive), profileImage);
	return new ResponseEntity<User>(newUser, HttpStatus.OK);
    }

    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('user:update')")
    public ResponseEntity<User> updateUser(@RequestParam("currentUsername") String currentUserName,
	    @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName,
	    @RequestParam("username") String userName, @RequestParam("email") String email,
	    @RequestParam("role") String role, @RequestParam("isActive") String isActive,
	    @RequestParam("isNotLocked") String isNotLocked,
	    @RequestParam(value = "profileImage", required = false) MultipartFile profileImage)
	    throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException,
	    NotAnImageFileException {
	User updatedUser = userService.updateUser(currentUserName, firstName, lastName, userName, email, role,
		Boolean.parseBoolean(isNotLocked), Boolean.parseBoolean(isActive), profileImage);
	return new ResponseEntity<User>(updatedUser, HttpStatus.OK);
    }

    @GetMapping("/find/{username}")
    @PreAuthorize("hasAnyAuthority('user:read')")
    public ResponseEntity<User> getUser(@PathVariable("username") String username) {
	User user = userService.findByUsername(username);
	return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @GetMapping(path = "/image/profile/{userName}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getTempProfileImage(@PathVariable("userName") String userName) throws IOException {
	URL url = new URL(FileConstant.TEMP_PROFILE_IMAGE_BASE_URL + userName + FileConstant.VARIATION_HUMAN);
	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	try (InputStream inputStream = url.openStream()) {
	    int bytesRead;
	    byte[] chunk = new byte[1024];
	    while ((bytesRead = inputStream.read(chunk)) > 0) {
		byteArrayOutputStream.write(chunk, 0, bytesRead);
	    }
	}
	return byteArrayOutputStream.toByteArray();
    }

    @GetMapping(path = "/image/{userName}/{fileName}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getProfileImage(@PathVariable("userName") String userName, @PathVariable("fileName") String fileName)
	    throws IOException {
	return Files
		.readAllBytes(Paths.get(FileConstant.USER_FOLDER + userName + FileConstant.FORWARD_SLASH + fileName));
    }

    @GetMapping("/test")
    public String getTest() {
	return "ok";
    }

    private ResponseEntity<HttpResponse> response(HttpStatus httpStatus, String message) {
	return new ResponseEntity<HttpResponse>(
		new HttpResponse(httpStatus.value(), httpStatus, httpStatus.getReasonPhrase().toUpperCase(), message),
		httpStatus); // 2nd argument should be httpStatus or httpStatus.OK ?
    }

    private HttpHeaders getJwtHeader(CustomUserDetails customUserDetails) {
	HttpHeaders headers = new HttpHeaders();
	headers.add(SecurityConstant.TOKEN_HEADER, jwtUtility.generateJwtToken(customUserDetails));
	return headers;
    }

    private void authenticate(String userName, String passWord) {
	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, passWord));
    }

}