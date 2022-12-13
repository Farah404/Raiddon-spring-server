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

import fr.isika.al17.raiddonspringserver.models.Guild;
import fr.isika.al17.raiddonspringserver.repository.GuildRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class GuildController {

    @Autowired
    GuildRepository guildRepo;

    @GetMapping("/guilds")
    public ResponseEntity<List<Guild>> getAllGuild(@RequestParam(required = false) String guildName) {
	try {
	    List<Guild> guilds = new ArrayList<>();

	    if (guildName == null)
		guildRepo.findAll().forEach(guilds::add);
	    else
		guildRepo.findByGuildName(guildName).forEach(guilds::add);

	    if (guilds.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(guilds, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }


    @DeleteMapping("/guilds/{id}")
    public ResponseEntity<HttpStatus> deleteGuild(@PathVariable("id") long id) {
	try {
	    guildRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

}
