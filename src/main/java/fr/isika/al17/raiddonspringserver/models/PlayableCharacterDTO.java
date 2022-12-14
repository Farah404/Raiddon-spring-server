package fr.isika.al17.raiddonspringserver.models;

public class PlayableCharacterDTO {

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

    public PlayableCharacterDTO() {
	super();
    }

    public PlayableCharacterDTO(Long ilevel, Long level, String name, String wowLogLink, String realm, String faction,
	    String race, String playableClass, String mainSpec, String secondarySpec, String mainRole,
	    String secondaryRole, String firstProfession, String secondProfession, String guildRank, boolean hasGuild,
	    boolean canCook, boolean canFish, boolean canFirstAid) {
	super();
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
	this.guildRank = guildRank;
	this.hasGuild = hasGuild;
	this.canCook = canCook;
	this.canFish = canFish;
	this.canFirstAid = canFirstAid;
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

    public String getGuildRank() {
	return guildRank;
    }

    public void setGuildRank(String guildRank) {
	this.guildRank = guildRank;
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

}
