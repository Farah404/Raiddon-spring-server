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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	    List<Raid> raids = new ArrayList<Raid>();

	    if (raidZone == null)
		raidRepo.findAll().forEach(raids::add);
	    else
		raidRepo.findByRaidZone(raidZone).forEach(raids::add);

	    if (raids.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(raids, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @GetMapping("/raids/{id}")
    public ResponseEntity<Raid> getRaidById(@PathVariable("id") long id) {
	Optional<Raid> raidData = raidRepo.findById(id);

	if (raidData.isPresent()) {
	    return new ResponseEntity<>(raidData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }
    
    @PostMapping("/raids/add")
    public ResponseEntity<Raid> createRaid(@RequestBody Raid raid) {
	try {
	    Raid _raid = raidRepo.save(new Raid(
		    raid.getId(), 
		    raid.getRaidName(),
		    raid.getRaidZone(),
		    raid.getRaidTotalEncounters(),
		    raid.getRaidPullTimeDate(),
		    raid.getRaidOffTimeDate(),
		    raid.getRaidDifficulty(),
		    raid.getRaidLootSystem(),
		    raid.getRaidRequirements(),
		    raid.getRaidLeader()
		    ));
	    return new ResponseEntity<>(_raid, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @DeleteMapping("/raids/{id}")
	public ResponseEntity<HttpStatus> Raid(@PathVariable("id") long id) {
		try {
		    raidRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
    @DeleteMapping("/raids")
    public ResponseEntity<HttpStatus> deleteAllRaids() {
	try {
	    raidRepo.deleteAll();
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }

}
