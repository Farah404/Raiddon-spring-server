package fr.isika.al17.raiddonspringserver.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.Messaging;
import fr.isika.al17.raiddonspringserver.repository.MessagingRepository;

@CrossOrigin(origins = "http://raiddon.s3-website.eu-west-3.amazonaws.com", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MessagingController {
    
    @Autowired
    MessagingRepository messagingRepo;
    
    @PostMapping("/messaging/add")
    public ResponseEntity<Messaging> addMessage(@RequestBody Messaging messaging) {
	try {
	    Messaging _messaging = messagingRepo.save(
		    new Messaging(null, messaging.getUserSender(), messaging.getUserReceiver(), messaging.getSubject(), messaging.getMessage()));
	    return new ResponseEntity<>(_messaging, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @GetMapping("/messaging")
    public ResponseEntity<List<Messaging>> getAllMessages(
	    @RequestParam(required = false) Long id) {
	try {
	    List<Messaging> messages = new ArrayList<Messaging>();

	    if (id == null)
		messagingRepo.findAll().forEach(messages::add);
	    else
		messagingRepo.findByid(id).forEach(messages::add);

	    if (messages.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(messages, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }


}
