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

import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;
import fr.isika.al17.raiddonspringserver.repository.PlayableCharacterRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PlayableCharacterController {

    @Autowired
    PlayableCharacterRepository playableCharacterRepo;

    @GetMapping("/characters")
    public ResponseEntity<List<PlayableCharacter>> getAllPlayableCharacter(
	    @RequestParam(required = false) String name) {
	try {
	    List<PlayableCharacter> playableCharacters = new ArrayList<>();

	    if (name == null)
		playableCharacterRepo.findAll().forEach(playableCharacters::add);
	    else
		playableCharacterRepo.findByNameContaining(name).forEach(playableCharacters::add);

	    if (playableCharacters.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(playableCharacters, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }


    @DeleteMapping("/characters/{id}")
    public ResponseEntity<HttpStatus> deletePlayableCharacter(@PathVariable("id") long id) {
	try {
	    playableCharacterRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
}
