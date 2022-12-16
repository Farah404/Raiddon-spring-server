package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RaidApplication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User connectedUser;

    @OneToOne
    private Raid selectedRaid;

    public RaidApplication() {
	super();
    }

    public RaidApplication(Long id, User connectedUser, Raid selectedRaid) {
	super();
	this.id = id;
	this.connectedUser = connectedUser;
	this.selectedRaid = selectedRaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getConnectedUser() {
        return connectedUser;
    }

    public void setConnectedUser(User connectedUser) {
        this.connectedUser = connectedUser;
    }

    public Raid getSelectedRaid() {
        return selectedRaid;
    }

    public void setSelectedRaid(Raid selectedRaid) {
        this.selectedRaid = selectedRaid;
    }
}
