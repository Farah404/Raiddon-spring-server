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

import fr.isika.al17.raiddonspringserver.dao.personRepository.UserAccountRepository;
import fr.isika.al17.raiddonspringserver.models.personManagement.UserAccount;
import io.swagger.annotations.Api;

@Api(description = "API for basic CRUD functions for User Account microservices")
@RestController
@RequestMapping(path = "/administratorAccount")
public class UserAccountController {

    @Autowired
    UserAccountRepository userAccountRepository;

    @PostMapping(path = "/addUserAccount")
    public ResponseEntity<Void> createUserAccount(@Valid @RequestBody UserAccount userAccount) {

	UserAccount addedUser = userAccountRepository.save(userAccount);

	if (addedUser == null)
	    return ResponseEntity.noContent().build();

	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedUser.getId())
		.toUri();

	return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/userAccount/{id}")
    public void deleteUserAccount(@PathVariable Integer id) {
	userAccountRepository.deleteById(id);
    }

    @PutMapping(path = "/updateUserAccount")
    public void editUserAccount(@RequestBody UserAccount userAccount) {
	userAccountRepository.save(userAccount);
    }

}