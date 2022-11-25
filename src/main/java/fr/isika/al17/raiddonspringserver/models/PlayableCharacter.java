package fr.isika.al17.raiddonspringserver.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import fr.isika.al17.raiddonspringserver.enumerationClasses.Factions;
import fr.isika.al17.raiddonspringserver.enumerationClasses.GuildRanks;
import fr.isika.al17.raiddonspringserver.enumerationClasses.PlayableClasses;
import fr.isika.al17.raiddonspringserver.enumerationClasses.ProfessionSpecialisation;
import fr.isika.al17.raiddonspringserver.enumerationClasses.Professions;
import fr.isika.al17.raiddonspringserver.enumerationClasses.Races;
import fr.isika.al17.raiddonspringserver.enumerationClasses.Specialisation;

@Entity
public class PlayableCharacter {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private Integer ilevel;
    private boolean hasGuild;
    private boolean canCook;
    private boolean canFish;
    private boolean canFirstAid;
    private String wowLogLink;
    private Integer characterLevel;
    
    // Defining FACTION
    @Enumerated(EnumType.STRING)
    private Factions playableCharacterFaction;
    
    // Defining RACE
    @Enumerated(EnumType.STRING)
    private Races playableCharacterAllianceRace;

    // Defining CLASS
    @Enumerated(EnumType.STRING)
    private PlayableClasses playableCharacterClass;   
    
    // Defining MAIN SPEC
    @Enumerated(EnumType.STRING)
    private Specialisation playableCharacterSpecialisationMain; 
    
    //Defining SECONDARY SPEC
    @Enumerated(EnumType.STRING)
    private Specialisation playableCharacterSpecialisationSecondary; 
    
    // Defining FIRST PROFESSION
    @Enumerated(EnumType.STRING)
    private Professions firstProfession;
    @Enumerated(EnumType.STRING)
    private ProfessionSpecialisation firstProfessionSpecialisation;
    
    // Defining SECOND PROFESSION
    @Enumerated(EnumType.STRING)
    private Professions secondProfession;
    @Enumerated(EnumType.STRING)
    private ProfessionSpecialisation secondProfessionSpecialisation;
    
    // Defining GUILD RANK
    @Enumerated(EnumType.STRING)
    private GuildRanks guildRank;
    
    @OneToOne
    private Equipmnet equipment;
    
    @OneToOne
    private Guild guild;
    
    @OneToMany
    private Set<Reputation> reputations;

    public PlayableCharacter() {
	super();
    }

    public PlayableCharacter(Integer id, Integer ilevel, boolean hasGuild, boolean canCook, boolean canFish,
	    boolean canFirstAid, String wowLogLink, Integer characterLevel, Factions playableCharacterFaction,
	    Races playableCharacterAllianceRace, PlayableClasses playableCharacterClass,
	    Specialisation playableCharacterSpecialisationMain, Specialisation playableCharacterSpecialisationSecondary,
	    Professions firstProfession, ProfessionSpecialisation firstProfessionSpecialisation,
	    Professions secondProfession, ProfessionSpecialisation secondProfessionSpecialisation, GuildRanks guildRank,
	    Equipmnet equipment, Guild guild, Set<Reputation> reputations) {
	super();
	this.id = id;
	this.ilevel = ilevel;
	this.hasGuild = hasGuild;
	this.canCook = canCook;
	this.canFish = canFish;
	this.canFirstAid = canFirstAid;
	this.wowLogLink = wowLogLink;
	this.characterLevel = characterLevel;
	this.playableCharacterFaction = playableCharacterFaction;
	this.playableCharacterAllianceRace = playableCharacterAllianceRace;
	this.playableCharacterClass = playableCharacterClass;
	this.playableCharacterSpecialisationMain = playableCharacterSpecialisationMain;
	this.playableCharacterSpecialisationSecondary = playableCharacterSpecialisationSecondary;
	this.firstProfession = firstProfession;
	this.firstProfessionSpecialisation = firstProfessionSpecialisation;
	this.secondProfession = secondProfession;
	this.secondProfessionSpecialisation = secondProfessionSpecialisation;
	this.guildRank = guildRank;
	this.equipment = equipment;
	this.guild = guild;
	this.reputations = reputations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIlevel() {
        return ilevel;
    }

    public void setIlevel(Integer ilevel) {
        this.ilevel = ilevel;
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

    public String getWowLogLink() {
        return wowLogLink;
    }

    public void setWowLogLink(String wowLogLink) {
        this.wowLogLink = wowLogLink;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public Factions getPlayableCharacterFaction() {
        return playableCharacterFaction;
    }

    public void setPlayableCharacterFaction(Factions playableCharacterFaction) {
        this.playableCharacterFaction = playableCharacterFaction;
    }

    public Races getPlayableCharacterAllianceRace() {
        return playableCharacterAllianceRace;
    }

    public void setPlayableCharacterAllianceRace(Races playableCharacterAllianceRace) {
        this.playableCharacterAllianceRace = playableCharacterAllianceRace;
    }

    public PlayableClasses getPlayableCharacterClass() {
        return playableCharacterClass;
    }

    public void setPlayableCharacterClass(PlayableClasses playableCharacterClass) {
        this.playableCharacterClass = playableCharacterClass;
    }

    public Specialisation getPlayableCharacterSpecialisationMain() {
        return playableCharacterSpecialisationMain;
    }

    public void setPlayableCharacterSpecialisationMain(Specialisation playableCharacterSpecialisationMain) {
        this.playableCharacterSpecialisationMain = playableCharacterSpecialisationMain;
    }

    public Specialisation getPlayableCharacterSpecialisationSecondary() {
        return playableCharacterSpecialisationSecondary;
    }

    public void setPlayableCharacterSpecialisationSecondary(Specialisation playableCharacterSpecialisationSecondary) {
        this.playableCharacterSpecialisationSecondary = playableCharacterSpecialisationSecondary;
    }

    public Professions getFirstProfession() {
        return firstProfession;
    }

    public void setFirstProfession(Professions firstProfession) {
        this.firstProfession = firstProfession;
    }

    public ProfessionSpecialisation getFirstProfessionSpecialisation() {
        return firstProfessionSpecialisation;
    }

    public void setFirstProfessionSpecialisation(ProfessionSpecialisation firstProfessionSpecialisation) {
        this.firstProfessionSpecialisation = firstProfessionSpecialisation;
    }

    public Professions getSecondProfession() {
        return secondProfession;
    }

    public void setSecondProfession(Professions secondProfession) {
        this.secondProfession = secondProfession;
    }

    public ProfessionSpecialisation getSecondProfessionSpecialisation() {
        return secondProfessionSpecialisation;
    }

    public void setSecondProfessionSpecialisation(ProfessionSpecialisation secondProfessionSpecialisation) {
        this.secondProfessionSpecialisation = secondProfessionSpecialisation;
    }

    public GuildRanks getGuildRank() {
        return guildRank;
    }

    public void setGuildRank(GuildRanks guildRank) {
        this.guildRank = guildRank;
    }

    public Equipmnet getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipmnet equipment) {
        this.equipment = equipment;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Set<Reputation> getReputations() {
        return reputations;
    }

    public void setReputations(Set<Reputation> reputations) {
        this.reputations = reputations;
    }
    
    

   }