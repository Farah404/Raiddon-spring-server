package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.RaidRequirements;
import fr.isika.al17.raiddonspringserver.repository.RaidRequirementsRepository;

@Service
public class RaidRequirementsService {

    @Autowired
    private RaidRequirementsRepository repository;

    public RaidRequirements addRaidRequirements(RaidRequirements raidRequirements) {
	return repository.save(raidRequirements);
    }

    public List<RaidRequirements> getRaidRequirements() {
	List<RaidRequirements> raidRequirements = repository.findAll();
	return raidRequirements;
    }

    public void deleteRaidRequirements(RaidRequirements raidRequirements) {
	repository.delete(raidRequirements);
    }

}
