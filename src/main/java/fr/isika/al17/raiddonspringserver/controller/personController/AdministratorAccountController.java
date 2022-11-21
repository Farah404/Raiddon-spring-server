package fr.isika.al17.raiddonspringserver.controller.personController;

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

import fr.isika.al17.raiddonspringserver.dao.personRepository.AdministratorAccountRepository;
import fr.isika.al17.raiddonspringserver.models.personManagement.AdministratorAccount;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for Administrator Account microservices")
@RestController
@RequestMapping(path="/administratorAccount")
public class AdministratorAccountController {
   
    @Autowired
    AdministratorAccountRepository administratorAccountRepository;
    
    @PostMapping(path="/addAdministratorAccount")
    public ResponseEntity<Void> createAdministratorAccount(@Valid @RequestBody AdministratorAccount administratorAccount){
	
	AdministratorAccount addedAdmin = administratorAccountRepository.save(administratorAccount);
	
	if (addedAdmin == null)
	    return ResponseEntity.noContent().build();
	
	URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(addedAdmin.getId())
                .toUri();
	
	return ResponseEntity.created(uri).build();
    }
    
    @DeleteMapping (path="/administratorAccount/{id}")
    public void deleteAdministratorAccount(@PathVariable Integer id) {
	administratorAccountRepository.deleteById(id);
    }
    
    @PutMapping (path="/updateAdministratorAccount")
    public void editAdministratorAccount(@RequestBody AdministratorAccount administratorAccount) {
	administratorAccountRepository.save(administratorAccount);
    }

}