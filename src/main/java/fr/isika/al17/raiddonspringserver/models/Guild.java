package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import fr.isika.al17.raiddonspringserver.enumerationClasses.LootSystems;

@Entity
public class Guild {

    @Id
    @GeneratedValue
    private Long id;
    private Long rank;
    private Long totalPlayers;
    private Long raidsPerWeek;

    private String guildName;
    private String realm;
    private String activities;
    private String guildEmblem;
    private String wowLogLink;
    private String slogan;
    private String objectives;

    private boolean recruiting;

    private LootSystems lootSystems;

    public Guild() {
	super();
    }

    public Guild(Long id, Long rank, Long totalPlayers, Long raidsPerWeek, String guildName, String realm,
	    String activities, String guildEmblem, String wowLogLink, String slogan, String objectives,
	    boolean recruiting, LootSystems lootSystems) {
	super();
	this.id = id;
	this.rank = rank;
	this.totalPlayers = totalPlayers;
	this.raidsPerWeek = raidsPerWeek;
	this.guildName = guildName;
	this.realm = realm;
	this.activities = activities;
	this.guildEmblem = guildEmblem;
	this.wowLogLink = wowLogLink;
	this.slogan = slogan;
	this.objectives = objectives;
	this.recruiting = recruiting;
	this.lootSystems = lootSystems;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Long getRank() {
	return rank;
    }

    public void setRank(Long rank) {
	this.rank = rank;
    }

    public Long getTotalPlayers() {
	return totalPlayers;
    }

    public void setTotalPlayers(Long totalPlayers) {
	this.totalPlayers = totalPlayers;
    }

    public Long getRaidsPerWeek() {
	return raidsPerWeek;
    }

    public void setRaidsPerWeek(Long raidsPerWeek) {
	this.raidsPerWeek = raidsPerWeek;
    }

    public String getGuildName() {
	return guildName;
    }

    public void setGuildName(String guildName) {
	this.guildName = guildName;
    }

    public String getRealm() {
	return realm;
    }

    public void setRealm(String realm) {
	this.realm = realm;
    }

    public String getActivities() {
	return activities;
    }

    public void setActivities(String activities) {
	this.activities = activities;
    }

    public String getGuildEmblem() {
	return guildEmblem;
    }

    public void setGuildEmblem(String guildEmblem) {
	this.guildEmblem = guildEmblem;
    }

    public String getWowLogLink() {
	return wowLogLink;
    }

    public void setWowLogLink(String wowLogLink) {
	this.wowLogLink = wowLogLink;
    }

    public String getSlogan() {
	return slogan;
    }

    public void setSlogan(String slogan) {
	this.slogan = slogan;
    }

    public String getObjectives() {
	return objectives;
    }

    public void setObjectives(String objectives) {
	this.objectives = objectives;
    }

    public boolean isRecruiting() {
	return recruiting;
    }

    public void setRecruiting(boolean recruiting) {
	this.recruiting = recruiting;
    }

    public LootSystems getLootSystems() {
	return lootSystems;
    }

    public void setLootSystems(LootSystems lootSystems) {
	this.lootSystems = lootSystems;
    }


}
