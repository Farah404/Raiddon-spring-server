package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.Preferences;
import fr.isika.al17.raiddonspringserver.repository.PreferencesRepository;

@Service
public class PreferencesService {
    
	@Autowired
	private PreferencesRepository repository;
	

	public Preferences addPreferences(Preferences preferences) {
		return repository.save(preferences);
	}

	public List<Preferences> getPreferences() {
		List<Preferences> preferences = repository.findAll();
		return preferences;
	}

	public void deletePreferences(Preferences preferences) {
		repository.delete(preferences);
	}

}
