package fr.isika.al17.raiddonspringserver.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password;

    private String battleTag;

    private String profilePicture;
    
    private String guildRank;

    @OneToOne
    private PlayableCharacter playableCharacter;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(String username, String email, String password) {
	this.username = username;
	this.email = email;
	this.password = password;
    }

    public User(Long id, String username, String email, String password, String battleTag, String profilePicture,
	    PlayableCharacter playableCharacter, Set<Role> roles, String guildRank) {
	super();
	this.id = id;
	this.username = username;
	this.email = email;
	this.password = password;
	this.battleTag = battleTag;
	this.profilePicture = profilePicture;
	this.playableCharacter = playableCharacter;
	this.roles = roles;
	this.guildRank = guildRank;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getBattleTag() {
	return battleTag;
    }

    public void setBattleTag(String battleTag) {
	this.battleTag = battleTag;
    }

    public String getProfilePicture() {
	return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
	this.profilePicture = profilePicture;
    }

    public PlayableCharacter getPlayableCharacter() {
	return playableCharacter;
    }

    public void setPlayableCharacter(PlayableCharacter playableCharacter) {
	this.playableCharacter = playableCharacter;
    }

    public Set<Role> getRoles() {
	return roles;
    }

    public void setRoles(Set<Role> roles) {
	this.roles = roles;
    }

    public String getGuildRank() {
        return guildRank;
    }

    public void setGuildRank(String guildRank) {
        this.guildRank = guildRank;
    }

}
