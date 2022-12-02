package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.RaidRequirements;

public interface RaidRequirementsRepository extends JpaRepository<RaidRequirements, Long> {
    
    List<RaidRequirements> findByMainClass(String mainClass);

}
