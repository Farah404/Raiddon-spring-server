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

import fr.isika.al17.raiddonspringserver.models.GuildRecruitment;
import fr.isika.al17.raiddonspringserver.repository.GuildRecruitmentRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class GuildRecuitmentController {

    @Autowired
    GuildRecruitmentRepository guildRecruitRepo;

    @GetMapping("/guildRecruitments")
    public ResponseEntity<List<GuildRecruitment>> getAllGuildRecruitments(
	    @RequestParam(required = false) String playableCharacter) {
	try {
	    List<GuildRecruitment> guildRecruitments = new ArrayList<>();

	    if (playableCharacter == null)
		guildRecruitRepo.findAll().forEach(guildRecruitments::add);
	    else
		guildRecruitRepo.findByPlayableCharacter(playableCharacter).forEach(guildRecruitments::add);
	    if (guildRecruitments.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(guildRecruitments, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/guildRecruitments/{id}")
    public ResponseEntity<HttpStatus> deleteGuildRecruitment(@PathVariable("id") long id) {
	try {
	    guildRecruitRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

}
