package fr.isika.al17.raiddonspringserver.dao.lootRepository;

import org.springframework.data.repository.CrudRepository;

import fr.isika.al17.raiddonspringserver.models.lootManagement.Items;

public interface ItemsRepository extends CrudRepository<Items, Integer>{

}
