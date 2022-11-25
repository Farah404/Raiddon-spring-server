package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import fr.isika.al17.raiddonspringserver.enumerationClasses.LootSystems;

@Entity
public class Guild {

    @Id
    @GeneratedValue
    private Integer id;

    private String guildName;

    private Integer totalPlayers;

    private Integer raidsPerWeek;

    private String wowLogLink;

    private LootSystems lootSystems;

    private boolean recruiting;

    public Guild() {
	super();
    }

    public Guild(Integer id, String guildName, Integer totalPlayers, Integer raidsPerWeek, String wowLogLink,
	    LootSystems lootSystems, boolean recruiting) {
	super();
	this.id = id;
	this.guildName = guildName;
	this.totalPlayers = totalPlayers;
	this.raidsPerWeek = raidsPerWeek;
	this.wowLogLink = wowLogLink;
	this.lootSystems = lootSystems;
	this.recruiting = recruiting;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getGuildName() {
	return guildName;
    }

    public void setGuildName(String guildName) {
	this.guildName = guildName;
    }

    public Integer getTotalPlayers() {
	return totalPlayers;
    }

    public void setTotalPlayers(Integer totalPlayers) {
	this.totalPlayers = totalPlayers;
    }

    public Integer getRaidsPerWeek() {
	return raidsPerWeek;
    }

    public void setRaidsPerWeek(Integer raidsPerWeek) {
	this.raidsPerWeek = raidsPerWeek;
    }

    public String getWowLogLink() {
	return wowLogLink;
    }

    public void setWowLogLink(String wowLogLink) {
	this.wowLogLink = wowLogLink;
    }

    public LootSystems getLootSystems() {
	return lootSystems;
    }

    public void setLootSystems(LootSystems lootSystems) {
	this.lootSystems = lootSystems;
    }

    public boolean isRecruiting() {
	return recruiting;
    }

    public void setRecruiting(boolean recruiting) {
	this.recruiting = recruiting;
    }

}
