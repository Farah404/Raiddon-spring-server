package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.Items;
import fr.isika.al17.raiddonspringserver.repository.ItemsRepository;

@Service
public class ItemsService {

	@Autowired
	private ItemsRepository repository;
	

	public Items addItems(Items items) {
		return repository.save(items);
	}

	public List<Items> getItems () {
		List<Items> items = repository.findAll();
		return items;
	}

	public void deleteItems(Items items) {
		repository.delete(items);
	}
}
