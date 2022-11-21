package fr.isika.al17.raiddonspringserver.dao.playableCharacterRepository;

import org.springframework.data.repository.CrudRepository;

import fr.isika.al17.raiddonspringserver.models.playableCharacterManagement.Reputation;

public interface ReputationRepository extends CrudRepository<Reputation, Integer>{

}
