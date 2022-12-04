package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Raid {

    @Id
    @GeneratedValue
    private Long id;
    
    private String raidIcon;

    private String raidName;

    private String raidZone;

    private Integer raidTotalEncounters;
    
    private String raidDate;

    private String raidPullTime;
    
    private String raidOffTime;

    private String raidDifficulty;

    private String raidLootSystem;

    @OneToOne
    private RaidRequirements raidRequirements;

    @OneToOne
    private User raidLeader;

    public Raid() {
	super();
    }

    public Raid(Long id, String raidName, String raidZone, Integer raidTotalEncounters, String raidDate,
	    String raidPullTime, String raidOffTime, String raidDifficulty, String raidLootSystem,
	    RaidRequirements raidRequirements, User raidLeader, String raidIcon) {
	super();
	this.id = id;
	this.raidName = raidName;
	this.raidZone = raidZone;
	this.raidTotalEncounters = raidTotalEncounters;
	this.raidDate = raidDate;
	this.raidPullTime = raidPullTime;
	this.raidOffTime = raidOffTime;
	this.raidDifficulty = raidDifficulty;
	this.raidLootSystem = raidLootSystem;
	this.raidRequirements = raidRequirements;
	this.raidLeader = raidLeader;
	this.raidIcon = raidIcon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaidName() {
        return raidName;
    }

    public void setRaidName(String raidName) {
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

    public String getRaidDate() {
        return raidDate;
    }

    public void setRaidDate(String raidDate) {
        this.raidDate = raidDate;
    }

    public String getRaidPullTime() {
        return raidPullTime;
    }

    public void setRaidPullTime(String raidPullTime) {
        this.raidPullTime = raidPullTime;
    }

    public String getRaidOffTime() {
        return raidOffTime;
    }

    public void setRaidOffTime(String raidOffTime) {
        this.raidOffTime = raidOffTime;
    }

    public String getRaidDifficulty() {
        return raidDifficulty;
    }

    public void setRaidDifficulty(String raidDifficulty) {
        this.raidDifficulty = raidDifficulty;
    }

    public String getRaidLootSystem() {
        return raidLootSystem;
    }

    public void setRaidLootSystem(String raidLootSystem) {
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

    public String getRaidIcon() {
        return raidIcon;
    }

    public void setRaidIcon(String raidIcon) {
        this.raidIcon = raidIcon;
    }
    
    

    
}
