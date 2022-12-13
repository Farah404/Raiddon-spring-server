package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.Equipment;
import fr.isika.al17.raiddonspringserver.repository.EquipmentRepository;

@Service
public class EquipmentService {
    
	@Autowired
	private EquipmentRepository repository;
	

	public Equipment addEquipment(Equipment equipment) {
		return repository.save(equipment);
	}

	public List<Equipment> getEquipment() {
		List<Equipment> equipment = repository.findAll();
		return equipment;
	}

	public void deleteEquipment(Equipment equipment) {
		repository.delete(equipment);
	}

}
