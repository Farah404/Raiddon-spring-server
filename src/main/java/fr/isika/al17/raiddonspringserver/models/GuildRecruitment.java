package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GuildRecruitment {

    @Id
    @GeneratedValue
    private Long id;
    private Long minIlevel;
    private Long minLevel;

    private String playableCharacter;
    private String quantity;
    private String bulk;
    private String description;
    private String mainSpec;
    private String secondarySpec;
    private String mainRole;
    private String secondaryRole;
    private String firstProfession;
    private String secondProfession;
    private boolean canCook;
    private boolean canFish;
    private boolean canFirstAid;

    public GuildRecruitment() {
	super();
    }

    public GuildRecruitment(Long id, Long minIlevel, Long minLevel, String playableCharacter, String quantity,
	    String bulk, String description, String mainSpec, String secondarySpec, String mainRole,
	    String secondaryRole, String firstProfession, String secondProfession, boolean canCook, boolean canFish,
	    boolean canFirstAid) {
	super();
	this.id = id;
	this.minIlevel = minIlevel;
	this.minLevel = minLevel;
	this.playableCharacter = playableCharacter;
	this.quantity = quantity;
	this.bulk = bulk;
	this.description = description;
	this.mainSpec = mainSpec;
	this.secondarySpec = secondarySpec;
	this.mainRole = mainRole;
	this.secondaryRole = secondaryRole;
	this.firstProfession = firstProfession;
	this.secondProfession = secondProfession;
	this.canCook = canCook;
	this.canFish = canFish;
	this.canFirstAid = canFirstAid;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Long getMinIlevel() {
	return minIlevel;
    }

    public void setMinIlevel(Long minIlevel) {
	this.minIlevel = minIlevel;
    }

    public Long getMinLevel() {
	return minLevel;
    }

    public void setMinLevel(Long minLevel) {
	this.minLevel = minLevel;
    }

    public String getPlayableCharacter() {
	return playableCharacter;
    }

    public void setPlayableCharacter(String playableCharacter) {
	this.playableCharacter = playableCharacter;
    }

    public String getQuantity() {
	return quantity;
    }

    public void setQuantity(String quantity) {
	this.quantity = quantity;
    }

    public String getBulk() {
	return bulk;
    }

    public void setBulk(String bulk) {
	this.bulk = bulk;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
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
