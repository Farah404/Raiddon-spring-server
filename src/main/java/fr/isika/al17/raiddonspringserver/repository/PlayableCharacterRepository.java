package fr.isika.al17.raiddonspringserver.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;

public interface PlayableCharacterRepository extends JpaRepository<PlayableCharacter, Long> {
    List<PlayableCharacter> findByName(String name);

    List<PlayableCharacter> findByNameContaining(String name);
    
    Optional<PlayableCharacter> findByname(String name);

}
