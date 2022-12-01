package fr.isika.al17.raiddonspringserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.Preferences;

public interface PreferencesRepository extends JpaRepository<Preferences, Long> {

}
