package fr.isika.al17.raiddonspringserver.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import fr.isika.al17.raiddonspringserver.exception.ExceptionHandling;
import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;
import fr.isika.al17.raiddonspringserver.repository.PlayableCharacterRepository;

@RestController
@RequestMapping(value = { "/", "/playableCharacter" })
@CrossOrigin(origins = "http://localhost:4200")
public class PlayableCharacterController extends ExceptionHandling {
    
    @Autowired
    PlayableCharacterRepository playablecharacterrepository;
    
    @PostMapping("/add")
    @PreAuthorize("hasAnyAuthority('user:create')")
    public ResponseEntity<Void> createInsured(@RequestBody PlayableCharacter playableCharacter){
	
	PlayableCharacter _playableCharacter = playablecharacterrepository.save(playableCharacter);
   	
   	if (_playableCharacter == null)
   	    return ResponseEntity.noContent().build();
   	
   	URI uri = ServletUriComponentsBuilder
                   .fromCurrentRequest()
                   .path("/{id}")
                   .buildAndExpand(_playableCharacter.getId())
                   .toUri();
   	
   	return ResponseEntity.created(uri).build();
       }
    

    
    
}
