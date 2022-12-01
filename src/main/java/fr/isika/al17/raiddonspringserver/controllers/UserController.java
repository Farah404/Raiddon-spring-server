package fr.isika.al17.raiddonspringserver.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.User;
import fr.isika.al17.raiddonspringserver.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    UserRepository userRepo;
    
    @PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user) {
		Optional<User> userData = userRepo.findById(id);

		if (userData.isPresent()) {
		    User _user = userData.get();
		    _user.setPlayableCharacters(user.getPlayableCharacters());
			return new ResponseEntity<>(userRepo.save(_user), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
