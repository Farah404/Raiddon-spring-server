package fr.isika.al17.raiddonspringserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.GuildApplication;
import fr.isika.al17.raiddonspringserver.repository.GuildApplicationRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class GuildApplicationController {

    @Autowired
    GuildApplicationRepository guildApplicationRepo;

    @PostMapping("/guildApplication/add")
    public ResponseEntity<GuildApplication> addGuildApplication(@RequestBody GuildApplication guildApplication) {
	try {
	    GuildApplication _guildApplication = guildApplicationRepo.save(new GuildApplication(null,
		    guildApplication.getConnectedUser(), guildApplication.getSelectedGuild()));
	    return new ResponseEntity<>(_guildApplication, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

}
