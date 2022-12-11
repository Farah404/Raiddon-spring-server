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

import fr.isika.al17.raiddonspringserver.models.RaidRequirements;
import fr.isika.al17.raiddonspringserver.repository.RaidRequirementsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class RaidRequirementsController {

    @Autowired
    RaidRequirementsRepository raidRequirementsRepo;

    @GetMapping("/raidRequirements")
    public ResponseEntity<List<RaidRequirements>> getAllRaidRequirements(
	    @RequestParam(required = false) String mainClass) {
	try {
	    List<RaidRequirements> raidRequirements = new ArrayList<>();

	    if (mainClass == null)
		raidRequirementsRepo.findAll().forEach(raidRequirements::add);
	    else
		raidRequirementsRepo.findByMainClass(mainClass).forEach(raidRequirements::add);

	    if (raidRequirements.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(raidRequirements, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @GetMapping("/raidRequirements/{id}")
    public ResponseEntity<RaidRequirements> getRaidRequirementsById(@PathVariable("id") long id) {
	Optional<RaidRequirements> raidRequirementsData = raidRequirementsRepo.findById(id);

	if (raidRequirementsData.isPresent()) {
	    return new ResponseEntity<>(raidRequirementsData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @PostMapping("/raidRequirements/add")
    public ResponseEntity<RaidRequirements> deleteRaidRequirements(@RequestBody RaidRequirements raidRequirements) {
	try {
	    RaidRequirements newRaidRequirements = raidRequirementsRepo.save(new RaidRequirements(
		    raidRequirements.getId(), raidRequirements.getMainClass(),
		    raidRequirements.getMainSpec(), raidRequirements.getSecondarySpec(), raidRequirements.getMainRole(),
		    raidRequirements.getSecondaryRole()));
	    return new ResponseEntity<>(newRaidRequirements, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @DeleteMapping("/raidRequirements/{id}")
	public ResponseEntity<HttpStatus> RaidRequirements(@PathVariable("id") long id) {
		try {
		    raidRequirementsRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
    @DeleteMapping("/raidRequirements")
    public ResponseEntity<HttpStatus> deleteAllRaidRequirements() {
	try {
	    raidRequirementsRepo.deleteAll();
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }

}
