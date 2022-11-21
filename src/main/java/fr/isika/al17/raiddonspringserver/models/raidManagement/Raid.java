package fr.isika.al17.raiddonspringserver.models.raidManagement;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import fr.isika.al17.raiddonspringserver.models.enumerationClasses.equipments.LootSystems;
import fr.isika.al17.raiddonspringserver.models.enumerationClasses.raids.RaidDifficulty;
import fr.isika.al17.raiddonspringserver.models.enumerationClasses.raids.RaidName;

@Entity
public class Raid {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private RaidName raidName;
    
    private String raidZone;
    
    private Integer raidTotalEncounters;
    
    private Date raidPullTimeDate;
    
    private Date raidOffTimeDate;
    
    private RaidDifficulty raidDifficulty;
    
    private LootSystems raidLootSystem;

    public Raid() {
	super();
    }

    public Raid(Integer id, RaidName raidName, String raidZone, Integer raidTotalEncounters, Date raidPullTimeDate,
	    Date raidOffTimeDate, RaidDifficulty raidDifficulty, LootSystems raidLootSystem) {
	super();
	this.id = id;
	this.raidName = raidName;
	this.raidZone = raidZone;
	this.raidTotalEncounters = raidTotalEncounters;
	this.raidPullTimeDate = raidPullTimeDate;
	this.raidOffTimeDate = raidOffTimeDate;
	this.raidDifficulty = raidDifficulty;
	this.raidLootSystem = raidLootSystem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    
}
