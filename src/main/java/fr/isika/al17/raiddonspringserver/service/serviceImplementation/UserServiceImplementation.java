package fr.isika.al17.raiddonspringserver.service.serviceImplementation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.transaction.Transactional;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import fr.isika.al17.raiddonspringserver.constant.FileConstant;
import fr.isika.al17.raiddonspringserver.constant.UserServiceImplConstant;
import fr.isika.al17.raiddonspringserver.enumerationClasses.Role;
import fr.isika.al17.raiddonspringserver.exception.EmailExistsException;
import fr.isika.al17.raiddonspringserver.exception.EmailNotFoundException;
import fr.isika.al17.raiddonspringserver.exception.NotAnImageFileException;
import fr.isika.al17.raiddonspringserver.exception.UserNotFoundException;
import fr.isika.al17.raiddonspringserver.exception.UsernameExistsException;
import fr.isika.al17.raiddonspringserver.models.CustomUserDetails;
import fr.isika.al17.raiddonspringserver.models.User;
import fr.isika.al17.raiddonspringserver.repository.UserRepository;
import fr.isika.al17.raiddonspringserver.service.EmailService;
import fr.isika.al17.raiddonspringserver.service.LoginAttemptService;
import fr.isika.al17.raiddonspringserver.service.UserService;

@Service
@Transactional
@Qualifier("UserDetailsService_Customed")
public class UserServiceImplementation implements UserService, UserDetailsService {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
    private UserRepository userRepository;
    private LoginAttemptService loginAttemptService;
    private EmailService emailService;
    
    @Autowired    
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder,
	    LoginAttemptService loginAttemptService, EmailService emailService) {
	this.userRepository = userRepository;
	this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	this.loginAttemptService = loginAttemptService;
	this.emailService = emailService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = userRepository.findByUsername(username);
	if (user == null) {
	    LOGGER.error(UserServiceImplConstant.NO_USER_FOUND_BY_USERNAME + username);
	    throw new UsernameNotFoundException(UserServiceImplConstant.NO_USER_FOUND_BY_USERNAME + username);
	} else {
	    validateLoginAttempt(user);
	    userRepository.save(user);
	    CustomUserDetails userPrincipal = new CustomUserDetails(user);
	    LOGGER.info(UserServiceImplConstant.USER_FOUND_BY_USERNAME + username);
	    return userPrincipal;
	}
    }

    private void validateLoginAttempt(User user) {
	if (user.isNotLocked()) {
	    if (loginAttemptService.hasExceededMaxAttempts(user.getUsername())) {
		user.setNotLocked(false);
	    } else {
		user.setNotLocked(true);
	    }
	} else {
	    loginAttemptService.evictUserFromLoginAttemptCache(user.getUsername());
	}
    }

    @Override
    public User register(String firstName, String lastName, String userName, String email)
	    throws UserNotFoundException, UsernameExistsException, EmailExistsException, MessagingException {
	validateNewUserNameAndEmail(StringUtils.EMPTY, userName, email);
	User user = new User();
	user.setUserId(generateUserId());
	user.setFirstname(firstName);
	user.setLastname(lastName);
	user.setUsername(userName);
	String passWord = generatePassword();
	user.setPassword(encodePassword(passWord));
	user.setEmail(email);
	user.setProfileImageUrl(getTemporaryProfileImageUrl(userName));
	user.setJoinDate(new Date());
	user.setRole(Role.ROLE_USER.name());
	user.setAuthorities(Role.ROLE_USER.getAuthorities());
	user.setActive(true);
	user.setNotLocked(true);
	userRepository.save(user);
	LOGGER.info("New user password: " + passWord);
//	emailService.sendNewPassWordEmail(firstName, passWord, email);
	return user;
    }

    private User validateNewUserNameAndEmail(String currentUserName, String newUserName, String newEmail)
	    throws UserNotFoundException, UsernameExistsException, EmailExistsException {
	User newUserByUserName = findByUsername(newUserName);
	User newUserByEmail = findByEmail(newEmail);
	if (StringUtils.isNotBlank(currentUserName)) {
	    User currentUser = findByUsername(currentUserName);
	    if (currentUser == null) {
		throw new UserNotFoundException(UserServiceImplConstant.NO_USER_FOUND_BY_USERNAME + currentUserName);
	    }

	    if (newUserByUserName != null && !currentUser.getId().equals(newUserByUserName.getId())) {
		throw new UsernameExistsException(UserServiceImplConstant.USERNAME_ALREADY_EXISTS);
	    }

	    if (newUserByEmail != null && !currentUser.getId().equals(newUserByEmail.getId())) {
		throw new EmailExistsException(UserServiceImplConstant.EMAIL_ALREADY_EXISTS);
	    }
	    return currentUser;
	} else {
	    if (newUserByUserName != null) {
		throw new UsernameExistsException(UserServiceImplConstant.USERNAME_ALREADY_EXISTS);
	    }
	    if (newUserByEmail != null) {
		throw new EmailExistsException(UserServiceImplConstant.EMAIL_ALREADY_EXISTS);
	    }
	    return null;
	}
    }

    private String generateUserId() {
	return RandomStringUtils.randomNumeric(10);
    }

    private Role getRoleEnumName(String role) {
	return Role.valueOf(role.toUpperCase());
    }

    private String setProfileImageURL(String userName) {
	return ServletUriComponentsBuilder.fromCurrentContextPath().path(FileConstant.USER_IMAGE_PATH + userName
		+ FileConstant.FORWARD_SLASH + userName + FileConstant.DOT + FileConstant.JPG_EXTENSION).toUriString();
    }

    private String getTemporaryProfileImageUrl(String userName) {
	return ServletUriComponentsBuilder.fromCurrentContextPath()
		.path(FileConstant.DEFAULT_USER_IMAGE_PATH + userName).toUriString();
    }

    private String encodePassword(String password) {
	return bCryptPasswordEncoder.encode(password);
    }

    private String generatePassword() {
	return RandomStringUtils.randomAlphanumeric(10);
    }

    @Override
    public List<User> getUsers() {
	return userRepository.findAll();
    }

    @Override
    public User findByUsername(String userName) {
	return userRepository.findByUsername(userName);
    }

    @Override
    public User findByEmail(String email) {
	return userRepository.findByEmail(email);
    }

    @Override
    public User addNewUser(String firstName, String lastName, String userName, String email, String role,
	    boolean isNotLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException,
	    UsernameExistsException, EmailExistsException, IOException, NotAnImageFileException, MessagingException {
	validateNewUserNameAndEmail(StringUtils.EMPTY, userName, email);
	User user = new User();
	user.setUserId(generateUserId());
	user.setFirstname(firstName);
	user.setLastname(lastName);
	user.setJoinDate(new Date());
	user.setUsername(userName);
	user.setEmail(email);
	String passWord = generatePassword();
	user.setPassword(encodePassword(passWord));
	user.setActive(isActive);
	user.setNotLocked(isNotLocked);
	user.setRole(getRoleEnumName(role).name());
	user.setAuthorities(getRoleEnumName(role).getAuthorities());
	user.setProfileImageUrl(getTemporaryProfileImageUrl(userName));
	userRepository.save(user);
	saveProfileImage(user, profileImage);
	LOGGER.info("New user password: " + passWord);
	emailService.sendNewPassWordEmail(firstName, passWord, email);
	return user;
    }

    @Override
    public User updateUser(String currentUserName, String newFirstName, String newLastName, String newUserName,
	    String newEmail, String role, boolean isNotLocked, boolean isActive, MultipartFile profileImage)
	    throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException,
	    NotAnImageFileException {
	User currentUser = validateNewUserNameAndEmail(currentUserName, newUserName, newEmail);
	currentUser.setFirstname(newFirstName);
	currentUser.setLastname(newLastName);
	currentUser.setUsername(newUserName);
	currentUser.setEmail(newEmail);
	currentUser.setActive(isActive);
	currentUser.setNotLocked(isNotLocked);
	currentUser.setRole(getRoleEnumName(role).name());
	currentUser.setAuthorities(getRoleEnumName(role).getAuthorities());
	userRepository.save(currentUser);
	saveProfileImage(currentUser, profileImage);
	return currentUser;
    }

    @Override
    public void deleteUser(String userName) throws IOException, UserNotFoundException {
	User user = findByUsername(userName);
	if (user == null) {
	    throw new UserNotFoundException(UserServiceImplConstant.NO_USER_FOUND_BY_USERNAME);
	}
	Path userFolder = Paths.get(FileConstant.USER_FOLDER + user.getUsername()).toAbsolutePath().normalize();
	FileUtils.deleteDirectory(new File(userFolder.toString()));
	userRepository.deleteById(user.getId());
    }

    @Override
    public void resetPassWord(String email) throws EmailNotFoundException, MessagingException {
	User user = findByEmail(email);
	if (user == null) {
		throw new EmailNotFoundException(UserServiceImplConstant.NO_USER_FOUND_BY_EMAIL + email);
	}
	String password = generatePassword();
	user.setPassword(encodePassword(password));
	userRepository.save(user);
	LOGGER.info("New user password: " + password);
	emailService.sendNewPassWordEmail(user.getFirstname(), password, user.getEmail());
}

    @Override
    public User updateProfileImage(String userName, MultipartFile profileImage) throws UserNotFoundException,
	    UsernameExistsException, EmailExistsException, IOException, NotAnImageFileException {
	User user = validateNewUserNameAndEmail(userName, null, null);
	saveProfileImage(user, profileImage);
	return user;
    }

    private void saveProfileImage(User user, MultipartFile profileImage) throws IOException, NotAnImageFileException {
	if (profileImage != null) {
	    if (!Arrays.asList(MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_GIF_VALUE)
		    .contains(profileImage.getContentType())) {
		throw new NotAnImageFileException(profileImage.getOriginalFilename() + FileConstant.NOT_AN_IMAGE_FILE);
	    }
	    Path userFolder = Paths.get(FileConstant.USER_FOLDER + user.getUsername()).toAbsolutePath().normalize();
	    if (!Files.exists(userFolder)) {
		Files.createDirectories(userFolder);
		LOGGER.info(FileConstant.DIRECTORY_CREATED + userFolder);
	    }
	    Files.deleteIfExists(
		    Paths.get(userFolder + user.getUsername() + FileConstant.DOT + FileConstant.JPG_EXTENSION));
	    Files.copy(profileImage.getInputStream(),
		    userFolder.resolve(user.getUsername() + FileConstant.DOT + FileConstant.JPG_EXTENSION),
		    StandardCopyOption.REPLACE_EXISTING);
	    user.setProfileImageUrl(setProfileImageURL(user.getUsername()));
	    userRepository.save(user);
	    LOGGER.info(FileConstant.FILE_SAVED_IN_FILE_SYSTEM + profileImage.getOriginalFilename() + ", renamed to "
		    + user.getUsername() + FileConstant.DOT + FileConstant.JPG_EXTENSION);
	}
    }

}
