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

import fr.isika.al17.raiddonspringserver.models.GuildRecruitment;
import fr.isika.al17.raiddonspringserver.repository.GuildRecruitmentRepository;

@RestController
@CrossOrigin(origins = "https://raiddon.herokuapp.com")
@RequestMapping("/api")
public class GuildRecuitmentController {
    
    @Autowired
    GuildRecruitmentRepository guildRecruitRepo;
    
    @GetMapping("/guildRecruitments")
    public ResponseEntity<List<GuildRecruitment>> getAllGuildRecruitments(
	    @RequestParam(required = false) String playableCharacter) {
	try {
	    List<GuildRecruitment> guildRecruitments = new ArrayList<GuildRecruitment>();

	    if (playableCharacter == null)
		guildRecruitRepo.findAll().forEach(guildRecruitments::add);
	    else
		guildRecruitRepo.findByPlayableCharacter(playableCharacter).forEach(guildRecruitments::add);
	    if (guildRecruitments.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(guildRecruitments, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @GetMapping("/guildRecruitments/{id}")
    public ResponseEntity<GuildRecruitment> getGuildRecruitmentById(@PathVariable("id") long id) {
	Optional<GuildRecruitment> guildRecruitmentData = guildRecruitRepo.findById(id);

	if (guildRecruitmentData.isPresent()) {
	    return new ResponseEntity<>(guildRecruitmentData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }
    
    @PostMapping("/guildRecruitments/add")
    public ResponseEntity<GuildRecruitment> createGuildRecruitment(@RequestBody GuildRecruitment guildRecruitment) {
	try {
	    GuildRecruitment _guildRecruitment = guildRecruitRepo.save(new GuildRecruitment(
		    guildRecruitment.getId(),
		    guildRecruitment.getMinIlevel(),
		    guildRecruitment.getMinLevel(),
		    guildRecruitment.getPlayableCharacter(),
		    guildRecruitment.getQuantity(),
		    guildRecruitment.getBulk(),
		    guildRecruitment.getDescription(),
		    guildRecruitment.getMainSpec(),
		    guildRecruitment.getSecondarySpec(),
		    guildRecruitment.getMainRole(),
		    guildRecruitment.getSecondaryRole(),
		    guildRecruitment.getFirstProfession(),
		    guildRecruitment.getSecondProfession(),
		    guildRecruitment.isCanCook(),
		    guildRecruitment.isCanFish(),
		    guildRecruitment.isCanFirstAid()
		    ));
	    return new ResponseEntity<>(_guildRecruitment, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    
    @DeleteMapping("/guildRecruitments/{id}")
	public ResponseEntity<HttpStatus> GuildRecruitment(@PathVariable("id") long id) {
		try {
		    guildRecruitRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
    @DeleteMapping("/characters")
    public ResponseEntity<HttpStatus> deleteAllGuildRecruitments() {
	try {
	    guildRecruitRepo.deleteAll();
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }


}
