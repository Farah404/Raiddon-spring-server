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

import fr.isika.al17.raiddonspringserver.dao.playableCharacterRepository.ReputationRepository;
import fr.isika.al17.raiddonspringserver.models.playableCharacterManagement.Reputation;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for Reputation microservices")
@RestController
@RequestMapping(path = "/reputation")
public class ReputationController {

    @Autowired
    ReputationRepository reputationRepository;

    @PostMapping(path = "/addReputation")
    public ResponseEntity<Void> createReputation(@Valid @RequestBody Reputation reputation) {

	Reputation addedReputation = reputationRepository.save(reputation);

	if (addedReputation == null)
	    return ResponseEntity.noContent().build();

	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
		.buildAndExpand(addedReputation.getId()).toUri();

	return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/deleteReputation/{id}")
    public void deleteReputation(@PathVariable Integer id) {
	reputationRepository.deleteById(id);
    }

    @PutMapping(path = "/updateReputation")
    public void editReputation(@RequestBody Reputation reputation) {
	reputationRepository.save(reputation);
    }

}