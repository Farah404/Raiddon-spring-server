package fr.isika.al17.raiddonspringserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.security.services.MessageServiceImpl;


@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageServiceImpl service;
	 
	@GetMapping("/")
	public String getMessage() {
		return service.getMessage();
	}
}