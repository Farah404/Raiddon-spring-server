package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GuildApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User connectedUser;

    private Guild selectedGuild;

    public GuildApplication() {
	super();
    }

    public GuildApplication(Long id, User connectedUser, Guild selectedGuild) {
	super();
	this.id = id;
	this.connectedUser = connectedUser;
	this.selectedGuild = selectedGuild;
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

    public Guild getSelectedGuild() {
	return selectedGuild;
    }

    public void setSelectedGuild(Guild selectedGuild) {
	this.selectedGuild = selectedGuild;
    }

}
