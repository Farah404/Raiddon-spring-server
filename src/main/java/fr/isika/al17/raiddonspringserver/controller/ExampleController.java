//package fr.isika.al17.raiddonspringserver.controller;
//
//import java.net.URI;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import io.swagger.annotations.Api;
//
//@Api(description = "API for basic CRUD functions for Example microservices")
//@RestController
//@RequestMapping(path = "/raid")
//public class ExampleController {
//
//    @Autowired
//    ExampleRepository exampleRepository;
//
//    @PostMapping(path = "/addExample")
//    public ResponseEntity<Void> createRaid(@Valid @RequestBody Example example) {
//
//	Example addedExample = raidRepository.save(raid);
//
//	if (addedExample == null)
//	    return ResponseEntity.noContent().build();
//
//	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//		.buildAndExpand(addedExample.getId()).toUri();
//
//	return ResponseEntity.created(uri).build();
//    }
//
//    @DeleteMapping(path = "/deleteExample/{id}")
//    public void deleteExample(@PathVariable Integer id) {
//	exampleRepository.deleteById(id);
//    }
//
//    @PutMapping(path = "/updateExample")
//    public void editExample(@RequestBody Example example) {
//	exampleRepository.save(example);
//    }
//
//}