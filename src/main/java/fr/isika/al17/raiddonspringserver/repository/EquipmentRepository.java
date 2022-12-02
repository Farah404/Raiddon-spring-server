package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    
    List<Equipment> findByHeadItem(String headItem);
    

}
