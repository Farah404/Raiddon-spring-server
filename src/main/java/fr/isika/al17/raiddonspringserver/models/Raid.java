package fr.isika.al17.raiddonspringserver.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import fr.isika.al17.raiddonspringserver.enumerationClasses.LootSystems;
import fr.isika.al17.raiddonspringserver.enumerationClasses.RaidDifficulty;
import fr.isika.al17.raiddonspringserver.enumerationClasses.RaidName;

@Entity
public class Raid {

    @Id
    @GeneratedValue
    private Long id;

    private RaidName raidName;

    private String raidZone;

    private Integer raidTotalEncounters;

    private Date raidPullTimeDate;

    private Date raidOffTimeDate;

    private RaidDifficulty raidDifficulty;

    private LootSystems raidLootSystem;

    @OneToOne
    private RaidRequirements raidRequirements;

    @OneToOne
    private User raidLeader;

    public Raid() {
	super();
    }

    public Raid(Long id, RaidName raidName, String raidZone, Integer raidTotalEncounters, Date raidPullTimeDate,
	    Date raidOffTimeDate, RaidDifficulty raidDifficulty, LootSystems raidLootSystem,
	    RaidRequirements raidRequirements, User raidLeader) {
	super();
	this.id = id;
	this.raidName = raidName;
	this.raidZone = raidZone;
	this.raidTotalEncounters = raidTotalEncounters;
	this.raidPullTimeDate = raidPullTimeDate;
	this.raidOffTimeDate = raidOffTimeDate;
	this.raidDifficulty = raidDifficulty;
	this.raidLootSystem = raidLootSystem;
	this.raidRequirements = raidRequirements;
	this.raidLeader = raidLeader;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public RaidName getRaidName() {
	return raidName;
    }

    public void setRaidName(RaidName raidName) {
	this.raidName = raidName;
    }

    public String getRaidZone() {
	return raidZone;
    }

    public void setRaidZone(String raidZone) {
	this.raidZone = raidZone;
    }

    public Integer getRaidTotalEncounters() {
	return raidTotalEncounters;
    }

    public void setRaidTotalEncounters(Integer raidTotalEncounters) {
	this.raidTotalEncounters = raidTotalEncounters;
    }

    public Date getRaidPullTimeDate() {
	return raidPullTimeDate;
    }

    public void setRaidPullTimeDate(Date raidPullTimeDate) {
	this.raidPullTimeDate = raidPullTimeDate;
    }

    public Date getRaidOffTimeDate() {
	return raidOffTimeDate;
    }

    public void setRaidOffTimeDate(Date raidOffTimeDate) {
	this.raidOffTimeDate = raidOffTimeDate;
    }

    public RaidDifficulty getRaidDifficulty() {
	return raidDifficulty;
    }

    public void setRaidDifficulty(RaidDifficulty raidDifficulty) {
	this.raidDifficulty = raidDifficulty;
    }

    public LootSystems getRaidLootSystem() {
	return raidLootSystem;
    }

    public void setRaidLootSystem(LootSystems raidLootSystem) {
	this.raidLootSystem = raidLootSystem;
    }

    public RaidRequirements getRaidRequirements() {
	return raidRequirements;
    }

    public void setRaidRequirements(RaidRequirements raidRequirements) {
	this.raidRequirements = raidRequirements;
    }

    public User getRaidLeader() {
	return raidLeader;
    }

    public void setRaidLeader(User raidLeader) {
	this.raidLeader = raidLeader;
    }

}
