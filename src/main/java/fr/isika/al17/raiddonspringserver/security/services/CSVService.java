package fr.isika.al17.raiddonspringserver.security.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import fr.isika.al17.raiddonspringserver.helper.CSVHelper;
import fr.isika.al17.raiddonspringserver.models.Items;
import fr.isika.al17.raiddonspringserver.repository.ItemsRepository;

@Service
public class CSVService {
    
    @Autowired
    ItemsRepository itemsRepo;
    
    public void save(MultipartFile file) {
	    try {
	      List<Items> items = CSVHelper.csvToItems(file.getInputStream());
	      itemsRepo.saveAll(items);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
	    }
	  }

	  public List<Items> getAllItems() {
	    return itemsRepo.findAll();
	  }
	}