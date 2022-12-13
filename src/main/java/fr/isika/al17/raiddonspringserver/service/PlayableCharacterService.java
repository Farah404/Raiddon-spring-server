package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;
import fr.isika.al17.raiddonspringserver.repository.PlayableCharacterRepository;

@Service
public class PlayableCharacterService {
    
    @Autowired
	private PlayableCharacterRepository repository;
	

	public PlayableCharacter addPlayableCharacter(PlayableCharacter playableCharacter) {
		return repository.save(playableCharacter);
	}

	public List<PlayableCharacter> getPlayableCharacters() {
		List<PlayableCharacter> playableCharacters = repository.findAll();
		return playableCharacters;
	}

	public void deletePlayableCharacter(PlayableCharacter playableCharacter) {
		repository.delete(playableCharacter);
	}

}
