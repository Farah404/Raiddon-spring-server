package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.Guild;

public interface GuildRepository extends JpaRepository<Guild, Long> {
    
    List<Guild> findByGuildName(String guildName);
    List<Guild> findByRecruiting(boolean recruiting);

}
