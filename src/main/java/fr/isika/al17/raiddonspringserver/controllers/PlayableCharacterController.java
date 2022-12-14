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

import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;
import fr.isika.al17.raiddonspringserver.models.PlayableCharacterDTO;
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
	    List<PlayableCharacter> playableCharacters = new ArrayList<PlayableCharacter>();

	    if (name == null)
		playableCharacterRepo.findAll().forEach(playableCharacters::add);
	    else
		playableCharacterRepo.findByNameContaining(name).forEach(playableCharacters::add);

	    if (playableCharacters.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(playableCharacters, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @GetMapping("/characters/{id}")
    public ResponseEntity<PlayableCharacter> getPlayableCharacterById(@PathVariable("id") long id) {
	Optional<PlayableCharacter> playableCharacterData = playableCharacterRepo.findById(id);

	if (playableCharacterData.isPresent()) {
	    return new ResponseEntity<>(playableCharacterData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @PostMapping("/characters/add")
    public ResponseEntity<PlayableCharacter> createPlayableCharacter(@RequestBody PlayableCharacter playableCharacter) {
	try {
	    PlayableCharacter _playableCharacter = playableCharacterRepo.save(new PlayableCharacter(
		    playableCharacter.getId(), playableCharacter.getIlevel(), playableCharacter.getLevel(),
		    playableCharacter.getName(), playableCharacter.getWowLogLink(), playableCharacter.getRealm(),
		    playableCharacter.getFaction(), playableCharacter.getRace(), playableCharacter.getPlayableClass(),
		    playableCharacter.getMainSpec(), playableCharacter.getSecondarySpec(),
		    playableCharacter.getMainRole(), playableCharacter.getSecondaryRole(),
		    playableCharacter.getFirstProfession(), playableCharacter.getSecondProfession(),
		    playableCharacter.isHasGuild(), playableCharacter.isCanCook(), playableCharacter.isCanFish(),
		    playableCharacter.isCanFirstAid(), playableCharacter.getGuildRank(),
		    playableCharacter.getEquipment(), playableCharacter.getGuild(), playableCharacter.getPreferences()
		    ));
	    return new ResponseEntity<>(_playableCharacter, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @PutMapping("/charactersDTO")
    public ResponseEntity<PlayableCharacter> updatecharactersDTO(@RequestBody PlayableCharacterDTO playableCharacter) {
	Optional<PlayableCharacter> playableCharacterData = playableCharacterRepo.findByname(playableCharacter.getName());

	if (playableCharacterData.isPresent()) {
	    PlayableCharacter _playableCharacter = playableCharacterData.get();
	    _playableCharacter.setIlevel(playableCharacter.getIlevel());
	    _playableCharacter.setLevel(playableCharacter.getLevel());
	    _playableCharacter.setWowLogLink(playableCharacter.getWowLogLink());
	    _playableCharacter.setRealm(playableCharacter.getRealm());
	    _playableCharacter.setFaction(playableCharacter.getFaction());
	    _playableCharacter.setRace(playableCharacter.getRace());
	    _playableCharacter.setPlayableClass(playableCharacter.getPlayableClass());
	    _playableCharacter.setMainSpec(playableCharacter.getMainSpec());
	    _playableCharacter.setSecondarySpec(playableCharacter.getSecondarySpec());
	    _playableCharacter.setMainRole(playableCharacter.getMainRole());
	    _playableCharacter.setSecondaryRole(playableCharacter.getSecondaryRole());
	    _playableCharacter.setFirstProfession(playableCharacter.getFirstProfession());
	    _playableCharacter.setFirstProfession(playableCharacter.getSecondProfession());
	    _playableCharacter.setHasGuild(playableCharacter.isHasGuild());
	    _playableCharacter.setCanCook(playableCharacter.isCanCook());
	    _playableCharacter.setCanFish(playableCharacter.isCanFish());
	    _playableCharacter.setCanFirstAid(playableCharacter.isCanFirstAid());
	    _playableCharacter.setGuildRank(playableCharacter.getGuildRank());
	    
	    return new ResponseEntity<>(playableCharacterRepo.save(_playableCharacter), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @DeleteMapping("/characters/{id}")
    public ResponseEntity<HttpStatus> PlayableCharacter(@PathVariable("id") long id) {
	try {
	    playableCharacterRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
}
