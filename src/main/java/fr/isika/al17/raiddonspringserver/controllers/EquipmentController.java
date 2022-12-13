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

import fr.isika.al17.raiddonspringserver.models.Equipment;
import fr.isika.al17.raiddonspringserver.repository.EquipmentRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class EquipmentController {

    @Autowired
    EquipmentRepository equipmentRepo;

    @GetMapping("/equipment")
    public ResponseEntity<List<Equipment>> getAllEquipment(@RequestParam(required = false) String headItem) {
	try {
	    List<Equipment> equipments = new ArrayList<>();

	    if (headItem == null)
		equipmentRepo.findAll().forEach(equipments::add);
	    else
		equipmentRepo.findByHeadItem(headItem).forEach(equipments::add);

	    if (equipments.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(equipments, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/equipment/{id}")
    public ResponseEntity<HttpStatus> deleteEquipment(@PathVariable("id") long id) {
	try {
	    equipmentRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }


}
