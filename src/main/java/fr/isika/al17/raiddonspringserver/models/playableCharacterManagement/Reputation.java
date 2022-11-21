package fr.isika.al17.raiddonspringserver.models.playableCharacterManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import fr.isika.al17.raiddonspringserver.models.enumerationClasses.reputations.ReputationName;
import fr.isika.al17.raiddonspringserver.models.enumerationClasses.reputations.ReputationStanding;

@Entity
public class Reputation {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private ReputationName reputationName;
    private ReputationStanding reputationStanding;
    
    public Reputation() {
	super();
    }
    public Reputation(Integer id, ReputationName reputationName, ReputationStanding reputationStanding) {
	super();
	this.id = id;
	this.reputationName = reputationName;
	this.reputationStanding = reputationStanding;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ReputationName getReputationName() {
        return reputationName;
    }
    public void setReputationName(ReputationName reputationName) {
        this.reputationName = reputationName;
    }
    public ReputationStanding getReputationStanding() {
        return reputationStanding;
    }
    public void setReputationStanding(ReputationStanding reputationStanding) {
        this.reputationStanding = reputationStanding;
    }
    
    

}
