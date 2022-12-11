package fr.isika.al17.raiddonspringserver.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PlayableCharacter implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;

    @Id
    @GeneratedValue
    private Long id;
    private Long ilevel;
    private Long level;

    private String name;
    private String wowLogLink;
    private String realm;
    private String faction;
    private String race;
    private String playableClass;

    private String mainSpec;
    private String secondarySpec;
    private String mainRole;
    private String secondaryRole;
    private String firstProfession;
    private String secondProfession;
    private String guildRank;

    private boolean hasGuild;
    private boolean canCook;
    private boolean canFish;
    private boolean canFirstAid;
    
    @OneToOne
    private Equipment equipment;

    @OneToOne
    private Guild guild;

    @OneToOne
    private Preferences preferences;

    public PlayableCharacter() {
	super();
    }

    public PlayableCharacter(Long id, Long ilevel, Long level, String name, String wowLogLink, String realm,
	    String faction, String race, String playableClass, String mainSpec, String secondarySpec, String mainRole,
	    String secondaryRole, String firstProfession, String secondProfession, boolean hasGuild, boolean canCook,
	    boolean canFish, boolean canFirstAid, String guildRank, Equipment equipment, Guild guild,
	    Preferences preferences) {
	super();
	this.id = id;
	this.ilevel = ilevel;
	this.level = level;
	this.name = name;
	this.wowLogLink = wowLogLink;
	this.realm = realm;
	this.faction = faction;
	this.race = race;
	this.playableClass = playableClass;
	this.mainSpec = mainSpec;
	this.secondarySpec = secondarySpec;
	this.mainRole = mainRole;
	this.secondaryRole = secondaryRole;
	this.firstProfession = firstProfession;
	this.secondProfession = secondProfession;
	this.hasGuild = hasGuild;
	this.canCook = canCook;
	this.canFish = canFish;
	this.canFirstAid = canFirstAid;
	this.guildRank = guildRank;
	this.equipment = equipment;
	this.guild = guild;
	this.preferences = preferences;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Long getIlevel() {
	return ilevel;
    }

    public void setIlevel(Long ilevel) {
	this.ilevel = ilevel;
    }

    public Long getLevel() {
	return level;
    }

    public void setLevel(Long level) {
	this.level = level;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getWowLogLink() {
	return wowLogLink;
    }

    public void setWowLogLink(String wowLogLink) {
	this.wowLogLink = wowLogLink;
    }

    public String getRealm() {
	return realm;
    }

    public void setRealm(String realm) {
	this.realm = realm;
    }

    public String getFaction() {
	return faction;
    }

    public void setFaction(String faction) {
	this.faction = faction;
    }

    public String getRace() {
	return race;
    }

    public void setRace(String race) {
	this.race = race;
    }

    public String getPlayableClass() {
	return playableClass;
    }

    public void setPlayableClass(String playableClass) {
	this.playableClass = playableClass;
    }

    public String getMainSpec() {
	return mainSpec;
    }

    public void setMainSpec(String mainSpec) {
	this.mainSpec = mainSpec;
    }

    public String getSecondarySpec() {
	return secondarySpec;
    }

    public void setSecondarySpec(String secondarySpec) {
	this.secondarySpec = secondarySpec;
    }

    public String getMainRole() {
	return mainRole;
    }

    public void setMainRole(String mainRole) {
	this.mainRole = mainRole;
    }

    public String getSecondaryRole() {
	return secondaryRole;
    }

    public void setSecondaryRole(String secondaryRole) {
	this.secondaryRole = secondaryRole;
    }

    public String getFirstProfession() {
	return firstProfession;
    }

    public void setFirstProfession(String firstProfession) {
	this.firstProfession = firstProfession;
    }

    public String getSecondProfession() {
	return secondProfession;
    }

    public void setSecondProfession(String secondProfession) {
	this.secondProfession = secondProfession;
    }

    public boolean isHasGuild() {
	return hasGuild;
    }

    public void setHasGuild(boolean hasGuild) {
	this.hasGuild = hasGuild;
    }

    public boolean isCanCook() {
	return canCook;
    }

    public void setCanCook(boolean canCook) {
	this.canCook = canCook;
    }

    public boolean isCanFish() {
	return canFish;
    }

    public void setCanFish(boolean canFish) {
	this.canFish = canFish;
    }

    public boolean isCanFirstAid() {
	return canFirstAid;
    }

    public void setCanFirstAid(boolean canFirstAid) {
	this.canFirstAid = canFirstAid;
    }

    public String getGuildRank() {
	return guildRank;
    }

    public void setGuildRank(String guildRank) {
	this.guildRank = guildRank;
    }

    public Equipment getEquipment() {
	return equipment;
    }

    public void setEquipment(Equipment equipment) {
	this.equipment = equipment;
    }

    public Guild getGuild() {
	return guild;
    }

    public void setGuild(Guild guild) {
	this.guild = guild;
    }

    public Preferences getPreferences() {
	return preferences;
    }

    public void setPreferences(Preferences preferences) {
	this.preferences = preferences;
    }

}