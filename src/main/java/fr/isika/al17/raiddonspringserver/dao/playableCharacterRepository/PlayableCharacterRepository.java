package fr.isika.al17.raiddonspringserver.dao.playableCharacterRepository;

import org.springframework.data.repository.CrudRepository;

import fr.isika.al17.raiddonspringserver.models.playableCharacterManagement.PlayableCharacter;

public interface PlayableCharacterRepository extends CrudRepository<PlayableCharacter, Integer>{

}
