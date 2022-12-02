package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.GuildRecruitment;

public interface GuildRecruitmentRepository extends JpaRepository<GuildRecruitment, Long> {
    
    List<GuildRecruitment> findByPlayableCharacter(String playableCharacter);

}
