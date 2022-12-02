package fr.isika.al17.raiddonspringserver.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al17.raiddonspringserver.models.Items;
import fr.isika.al17.raiddonspringserver.repository.ItemsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ItemsController {
    
    @Autowired
    ItemsRepository itemsRepo;
    
    @GetMapping("/items")
    public ResponseEntity<List<Items>> getAllItems(
	    @RequestParam(required = false) String itemName) {
	try {
	    List<Items> items = new ArrayList<Items>();

	    if (itemName == null)
		itemsRepo.findAll().forEach(items::add);
	    else
		itemsRepo.findByItemName(itemName).forEach(items::add);

	    if (items.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    return new ResponseEntity<>(items, HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
    

}
