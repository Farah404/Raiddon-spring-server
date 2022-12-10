package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.Raid;

public interface RaidRepository extends JpaRepository<Raid, Long> {
    
    List<Raid> findByRaidZone(String raidZone);
    List<Raid> findByRaidName(String raidName);

}
