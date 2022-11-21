package fr.isika.al17.raiddonspringserver.controller.raidController;

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

import fr.isika.al17.raiddonspringserver.dao.raidRepository.RaidRepository;
import fr.isika.al17.raiddonspringserver.models.raidManagement.Raid;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for Raid microservices")
@RestController
@RequestMapping(path = "/raid")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @PostMapping(path = "/addRaid")
    public ResponseEntity<Void> createRaid(@Valid @RequestBody Raid raid) {

	Raid addedRaid = raidRepository.save(raid);

	if (addedRaid == null)
	    return ResponseEntity.noContent().build();

	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
		.buildAndExpand(addedRaid.getId()).toUri();

	return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/deleteRaid/{id}")
    public void deleteRaid(@PathVariable Integer id) {
	raidRepository.deleteById(id);
    }

    @PutMapping(path = "/updateRaid")
    public void editRaid(@RequestBody Raid raid) {
	raidRepository.save(raid);
    }

}
