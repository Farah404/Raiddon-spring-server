package fr.isika.al17.raiddonspringserver.controller.playableCharacterController;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import fr.isika.al17.raiddonspringserver.dao.playableCharacterRepository.PlayableCharacterRepository;
import fr.isika.al17.raiddonspringserver.models.playableCharacterManagement.PlayableCharacter;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for Playable Character microservices")
@RestController
@RequestMapping(path = "/playableCharacter")
public class PlayableCharacterController {

    @Autowired
    PlayableCharacterRepository playableCharacterRepository;

    @PostMapping(path = "/addPlayableCharacter")
    public ResponseEntity<Void> createPlayableCharacter(@Valid @RequestBody PlayableCharacter playableCharacter) {

	PlayableCharacter addedPlayableCharacter = playableCharacterRepository.save(playableCharacter);

	if (addedPlayableCharacter == null)
	    return ResponseEntity.noContent().build();

	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
		.buildAndExpand(addedPlayableCharacter.getId()).toUri();

	return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/deletePlayableCharacter/{id}")
    public void deletePlayableCharacter(@PathVariable Integer id) {
	playableCharacterRepository.deleteById(id);
    }

    @PutMapping(path = "/updatePlayableCharacter")
    public void editPlayableCharacter(@RequestBody PlayableCharacter playableCharacter) {
	playableCharacterRepository.save(playableCharacter);
    }

}