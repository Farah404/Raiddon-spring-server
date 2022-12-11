package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.isika.al17.raiddonspringserver.models.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {
    
    List<Items> findByItemName(String itemName);
    

}
