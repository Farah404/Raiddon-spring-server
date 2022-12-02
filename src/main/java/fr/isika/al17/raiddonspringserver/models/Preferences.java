package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.isika.al17.raiddonspringserver.enumerationClasses.LootSystems;

@Entity
public class Preferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long raidsPerWeek;

    private boolean seekingGuild;
    private boolean seekingRaid;

    private String description;
    private String objectives;

    private LootSystems lootSystems;

    public Preferences() {
	super();
    }

    public Preferences(Long id, Long raidsPerWeek, boolean seekingGuild, boolean seekingRaid, String description,
	    String objectives, LootSystems lootSystems) {
	super();
	this.id = id;
	this.raidsPerWeek = raidsPerWeek;
	this.seekingGuild = seekingGuild;
	this.seekingRaid = seekingRaid;
	this.description = description;
	this.objectives = objectives;
	this.lootSystems = lootSystems;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Long getRaidsPerWeek() {
	return raidsPerWeek;
    }

    public void setRaidsPerWeek(Long raidsPerWeek) {
	this.raidsPerWeek = raidsPerWeek;
    }

    public boolean isSeekingGuild() {
	return seekingGuild;
    }

    public void setSeekingGuild(boolean seekingGuild) {
	this.seekingGuild = seekingGuild;
    }

    public boolean isSeekingRaid() {
	return seekingRaid;
    }

    public void setSeekingRaid(boolean seekingRaid) {
	this.seekingRaid = seekingRaid;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getObjectives() {
	return objectives;
    }

    public void setObjectives(String objectives) {
	this.objectives = objectives;
    }

    public LootSystems getLootSystems() {
	return lootSystems;
    }

    public void setLootSystems(LootSystems lootSystems) {
	this.lootSystems = lootSystems;
    }

}
