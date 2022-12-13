package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.Raid;
import fr.isika.al17.raiddonspringserver.repository.RaidRepository;

@Service
public class RaidService {

    @Autowired
    private RaidRepository repository;

    public Raid addRaid(Raid raid) {
	return repository.save(raid);
    }

    public List<Raid> getRaids() {
	List<Raid> raid = repository.findAll();
	return raid;
    }

    public void deleteRaid(Raid raid) {
	repository.delete(raid);
    }

}
