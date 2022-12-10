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
	    List<Guild> guilds = new ArrayList<Guild>();

	    if (guildName == null)
		guildRepo.findAll().forEach(guilds::add);
	    else
		guildRepo.findByGuildName(guildName).forEach(guilds::add);

	    if (guilds.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(guilds, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @GetMapping("/guilds/recruiting")
	public ResponseEntity<List<Guild>> findByRecruiting() {
	try {
		List<Guild> guilds = guildRepo.findByRecruiting(true);

		if (guilds.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(guilds, HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
    
    @GetMapping("/guilds/{id}")
    public ResponseEntity<Guild> getGuildById(@PathVariable("id") long id) {
	Optional<Guild> guildData = guildRepo.findById(id);

	if (guildData.isPresent()) {
	    return new ResponseEntity<>(guildData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @PostMapping("/guilds/add")
    public ResponseEntity<Guild> Guild(@RequestBody Guild guild) {
	try {
	    Guild _guild = guildRepo.save(new Guild(guild.getId(), guild.getRank(), guild.getTotalPlayers(),
		    guild.getRaidsPerWeek(), guild.getGuildName(), guild.getRealm(), guild.getActivities(),
		    guild.getGuildEmblem(), guild.getWowLogLink(), guild.getSlogan(), guild.getObjectives(),
		    guild.isRecruiting(), guild.getLootSystems(), guild.getGuildRecruitment(), guild.getGuildMaster()));
	    return new ResponseEntity<>(_guild, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/guilds/{id}")
    public ResponseEntity<HttpStatus> Guild(@PathVariable("id") long id) {
	try {
	    guildRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/guilds")
    public ResponseEntity<HttpStatus> deleteAllGuilds() {
	try {
	    guildRepo.deleteAll();
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }

}
