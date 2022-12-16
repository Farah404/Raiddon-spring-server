package fr.isika.al17.raiddonspringserver.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @GetMapping("/guildApplication/{id}")
    public ResponseEntity<GuildApplication> getGuildApplicationById(@PathVariable("id") long id) {
	Optional<GuildApplication> guildApplicationData = guildApplicationRepo.findById(id);

	if (guildApplicationData.isPresent()) {
	    return new ResponseEntity<>(guildApplicationData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }
    
    @GetMapping("/guildApplication")
    public ResponseEntity<List<GuildApplication>> getAllGuildApplication(
	    @RequestParam(required = false) Long id) {
	try {
	    List<GuildApplication> guildApplications = new ArrayList<GuildApplication>();

	    if (id == null)
		guildApplicationRepo.findAll().forEach(guildApplications::add);
	    else
		guildApplicationRepo.findByid(id).forEach(guildApplications::add);

	    if (guildApplications.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(guildApplications, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

}
