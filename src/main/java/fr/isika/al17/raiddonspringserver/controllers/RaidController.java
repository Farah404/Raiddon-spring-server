package fr.isika.al17.raiddonspringserver.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.Raid;
import fr.isika.al17.raiddonspringserver.repository.RaidRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class RaidController {
    
    @Autowired
    RaidRepository raidRepo;
    
    @GetMapping("/raids")
    public ResponseEntity<List<Raid>> getAllRaid(
	    @RequestParam(required = false) String raidZone) {
	try {
	    List<Raid> raids = new ArrayList<>();

	    if (raidZone == null)
		raidRepo.findAll().forEach(raids::add);
	    else
		raidRepo.findByRaidZone(raidZone).forEach(raids::add);

	    if (raids.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(raids, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    
    @DeleteMapping("/raids/{id}")
	public ResponseEntity<HttpStatus> deleteRaid(@PathVariable("id") long id) {
		try {
		    raidRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    

}
