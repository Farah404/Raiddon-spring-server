package fr.isika.al17.raiddonspringserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.RaidApplication;
import fr.isika.al17.raiddonspringserver.repository.RaidApplicationRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class RaidApplicationController {

    @Autowired
    RaidApplicationRepository raidApplicationRepo;

    @PostMapping("/guildApplication/add")
    public ResponseEntity<RaidApplication> addRaidApplication(@RequestBody RaidApplication raidApplication) {
	try {
	    RaidApplication _raidApplication = raidApplicationRepo.save(
		    new RaidApplication(null, raidApplication.getConnectedUser(), raidApplication.getSelectedRaid()));
	    return new ResponseEntity<>(_raidApplication, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

}
