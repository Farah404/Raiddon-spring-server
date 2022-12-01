package fr.isika.al17.raiddonspringserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {

}
