package fr.isika.al17.raiddonspringserver.controller.guildController;

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

import fr.isika.al17.raiddonspringserver.dao.guildRepository.GuildRepository;
import fr.isika.al17.raiddonspringserver.models.guildManagement.Guild;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for Guild microservices")
@RestController
@RequestMapping(path = "/guild")
public class GuildController {

    @Autowired
    GuildRepository guildRepository;

    @PostMapping(path = "/addGuild")
    public ResponseEntity<Void> createGuild(@Valid @RequestBody Guild guild) {

	Guild addedGuild = guildRepository.save(guild);

	if (addedGuild == null)
	    return ResponseEntity.noContent().build();

	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedGuild.getId())
		.toUri();

	return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/deleteGuild/{id}")
    public void deleteGuild(@PathVariable Integer id) {
	guildRepository.deleteById(id);
    }

    @PutMapping(path = "/updateGuild")
    public void updateGuild(@RequestBody Guild guild) {
	guildRepository.save(guild);
    }

}
