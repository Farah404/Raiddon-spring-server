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

    @GetMapping("/equipment/{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable("id") long id) {
	Optional<Equipment> equipmentData = equipmentRepo.findById(id);

	if (equipmentData.isPresent()) {
	    return new ResponseEntity<>(equipmentData.get(), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

    @PostMapping("/equipment/add")
    public ResponseEntity<Equipment> creatEequipment(@RequestBody Equipment equipment) {
	try {
	    Equipment newEquipment = equipmentRepo.save(new Equipment(equipment.getId(), equipment.getHeadItem(),
		    equipment.getShoulderItem(), equipment.getBackItem(), equipment.getChestItem(),
		    equipment.getWristItem(), equipment.getHandItem(), equipment.getWaistItem(),
		    equipment.getLegsItem(), equipment.getFeetItem(), equipment.getNeckItem(),
		    equipment.getFirstRingItem(), equipment.getSecondRingItem(), equipment.getFirstTrinketItem(),
		    equipment.getSecondTrinketItem(), equipment.getMainHandItem(), equipment.getOffHandItem(),
		    equipment.getRelicItem()));
	    return new ResponseEntity<>(newEquipment, HttpStatus.CREATED);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/equipment/{id}")
    public ResponseEntity<HttpStatus> Equipment(@PathVariable("id") long id) {
	try {
	    equipmentRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @DeleteMapping("/equipment")
    public ResponseEntity<HttpStatus> deleteAllEquipment() {
	try {
	    equipmentRepo.deleteAll();
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

    }

}
