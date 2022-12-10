package fr.isika.al17.raiddonspringserver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fr.isika.al17.raiddonspringserver.helper.CSVHelper;
import fr.isika.al17.raiddonspringserver.models.Items;
import fr.isika.al17.raiddonspringserver.security.services.CSVResponseMessage;
import fr.isika.al17.raiddonspringserver.security.services.CSVService;


@CrossOrigin("*")
@Controller
@RequestMapping("/api/csv")
public class CSVController {
    

    @Autowired
    CSVService fileService;

    @PostMapping("/upload")
    public ResponseEntity<CSVResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
      String message = "";

      if (CSVHelper.hasCSVFormat(file)) {
        try {
          fileService.save(file);

          message = "Uploaded the file successfully: " + file.getOriginalFilename();
          return ResponseEntity.status(HttpStatus.OK).body(new CSVResponseMessage(message));
        } catch (Exception e) {
          message = "Could not upload the file: " + file.getOriginalFilename() + "!";
          return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new CSVResponseMessage(message));
        }
      }

      message = "Please upload a csv file!";
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new CSVResponseMessage(message));
    }

    @GetMapping("/items")
    public ResponseEntity<List<Items>> getAllTutorials() {
      try {
        List<Items> items = fileService.getAllItems();

        if (items.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(items, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

  }