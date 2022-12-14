package fr.isika.al17.raiddonspringserver.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.User;
import fr.isika.al17.raiddonspringserver.models.UserDTO;
import fr.isika.al17.raiddonspringserver.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String username) {
	try {
	    List<User> users = new ArrayList<User>();

	    if (username == null)
		userRepo.findAll().forEach(users::add);
	    else
		userRepo.findByusername(username).forEach(users::add);

	    if (users.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(users, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }
    
    @GetMapping("/users/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username) {
	Optional<User> userData = userRepo.findByUsername(username);
	return new ResponseEntity<>(userData.get(), HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
	Optional<User> userData = userRepo.findById(id);

	if (userData.isPresent()) {
	    return new ResponseEntity<>(userData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @PutMapping("/users")
    public ResponseEntity<User> updateUser(@RequestBody UserDTO user) {
	Optional<User> userData = userRepo.findByUsername(user.getUsername());

	if (userData.isPresent()) {
	    User _user = userData.get();
	    _user.setBattleTag(user.getBattleTag());
	    _user.setProfilePicture(user.getProfilePicture());
	    _user.setGuildRank(user.getGuildRank());
	    return new ResponseEntity<>(userRepo.save(_user), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") long id) {
	try {
	    userRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/users")
    public ResponseEntity<HttpStatus> deleteAllUsers() {
	try {
	    userRepo.deleteAll();
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }

}
