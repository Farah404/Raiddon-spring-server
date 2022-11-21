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

import fr.isika.al17.raiddonspringserver.dao.lootRepository.ItemsRepository;
import fr.isika.al17.raiddonspringserver.models.lootManagement.Items;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for Items microservices")
@RestController
@RequestMapping(path = "/loot")
public class ItemsController {

    @Autowired
    ItemsRepository itemsRepository;

    @PostMapping(path = "/addItem")
    public ResponseEntity<Void> createItem(@Valid @RequestBody Items item) {

	Items addedItem = itemsRepository.save(item);

	if (addedItem == null)
	    return ResponseEntity.noContent().build();

	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedItem.getId())
		.toUri();

	return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/deleteItem/{id}")
    public void deleteItem(@PathVariable Integer id) {
	itemsRepository.deleteById(id);
    }

    @PutMapping(path = "/updateItem")
    public void updateItem(@RequestBody Items item) {
	itemsRepository.save(item);
    }

}