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

import fr.isika.al17.raiddonspringserver.models.RaidApplication;
import fr.isika.al17.raiddonspringserver.repository.RaidApplicationRepository;

@CrossOrigin(origins = "http://raiddon.s3-website.eu-west-3.amazonaws.com", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class RaidApplicationController {

    @Autowired
    RaidApplicationRepository raidApplicationRepo;

    @PostMapping("/raidApplication/add")
    public ResponseEntity<RaidApplication> addRaidApplication(@RequestBody RaidApplication raidApplication) {
	try {
	    RaidApplication _raidApplication = raidApplicationRepo.save(
		    new RaidApplication(null, raidApplication.getConnectedUser(), raidApplication.getSelectedRaid()));
	    return new ResponseEntity<>(_raidApplication, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @GetMapping("/raidApplication")
    public ResponseEntity<List<RaidApplication>> getAllRaidApplication(
	    @RequestParam(required = false) Long id) {
	try {
	    List<RaidApplication> raidApplications = new ArrayList<RaidApplication>();

	    if (id == null)
		raidApplicationRepo.findAll().forEach(raidApplications::add);
	    else
		raidApplicationRepo.findByid(id).forEach(raidApplications::add);

	    if (raidApplications.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(raidApplications, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

}
