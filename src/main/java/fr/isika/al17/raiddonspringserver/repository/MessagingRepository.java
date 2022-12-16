package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.Messaging;

public interface MessagingRepository extends JpaRepository <Messaging, Long> {
    
    List<Messaging> findByid(Long id);
    
}