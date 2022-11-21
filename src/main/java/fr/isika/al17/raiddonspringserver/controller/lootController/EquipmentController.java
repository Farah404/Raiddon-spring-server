package fr.isika.al17.raiddonspringserver.controller.lootController;

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

import fr.isika.al17.raiddonspringserver.dao.lootRepository.EquipmentRepository;
import fr.isika.al17.raiddonspringserver.models.lootManagement.Equipmnet;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for Equipment microservices")
@RestController
@RequestMapping(path = "/equipment")
public class EquipmentController {
    
    @Autowired
    EquipmentRepository equipmentRepository;

    @PostMapping(path = "/addEquipment")
    public ResponseEntity<Void> createEquipment(@Valid @RequestBody Equipmnet equipment) {

	Equipmnet addedEquipment = equipmentRepository.save(equipment);

	if (addedEquipment == null)
	    return ResponseEntity.noContent().build();

	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
		.buildAndExpand(addedEquipment.getId()).toUri();

	return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/deleteEquipmnet/{id}")
    public void deleteEquipmnet(@PathVariable Integer id) {
	equipmentRepository.deleteById(id);
    }

    @PutMapping(path = "/updateEquipmnet")
    public void editEquipmnet(@RequestBody Equipmnet equipment) {
	equipmentRepository.save(equipment);
    }

}
