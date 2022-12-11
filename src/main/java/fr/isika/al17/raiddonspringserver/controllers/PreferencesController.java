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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.Preferences;
import fr.isika.al17.raiddonspringserver.repository.PreferencesRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PreferencesController {

    @Autowired
    PreferencesRepository prefRepo;

    @GetMapping("/preferences")
    public ResponseEntity<List<Preferences>> getAllPreferences(@RequestParam(required = false) String objectives) {
	try {
	    List<Preferences> preferences = new ArrayList<>();

	    if (objectives == null)
		prefRepo.findAll().forEach(preferences::add);
	    else
		prefRepo.findByObjectives(objectives).forEach(preferences::add);

	    if (preferences.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(preferences, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }

    @PutMapping("/preferences/{id}")
    public ResponseEntity<Preferences> updatePreferences(@PathVariable("id") long id,
	    @RequestBody Preferences preferences) {
	Optional<Preferences> preferencesData = prefRepo.findById(id);

	if (preferencesData.isPresent()) {
	    Preferences updatedPreferences = preferencesData.get();
	    updatedPreferences.setRaidsPerWeek(preferences.getRaidsPerWeek());
	    updatedPreferences.setDescription(preferences.getDescription());
	    updatedPreferences.setSeekingGuild(preferences.isSeekingGuild());
	    updatedPreferences.setSeekingRaid(preferences.isSeekingRaid());
	    updatedPreferences.setObjectives(preferences.getObjectives());
	    updatedPreferences.setLootSystems(preferences.getLootSystems());
	    return new ResponseEntity<>(prefRepo.save(updatedPreferences), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @PostMapping("/preferences/add")
    public ResponseEntity<Preferences> createPreferences(@RequestBody Preferences preferences) {
	try {
	    Preferences newpreferences = prefRepo.save(new Preferences(preferences.getId(), preferences.getRaidsPerWeek(),
		    preferences.isSeekingGuild(), preferences.isSeekingRaid(), preferences.getDescription(),
		    preferences.getObjectives(), preferences.getLootSystems()));
	    return new ResponseEntity<>(newpreferences, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/preferences/{id}")
    public ResponseEntity<HttpStatus> deletePreferences(@PathVariable("id") long id) {
	try {
	    prefRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @GetMapping("/preferences/{id}")
	public ResponseEntity<Preferences> getPreferencesById(@PathVariable("id") long id) {
		Optional<Preferences> preferencesData = prefRepo.findById(id);

		if (preferencesData.isPresent()) {
			return new ResponseEntity<>(preferencesData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
    
    

}
