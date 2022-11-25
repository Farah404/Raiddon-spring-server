package fr.isika.al17.raiddonspringserver.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long id;
    private String userId;
    private String firstname;
    private String lastname;
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String email;
    private String profileImageUrl;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private Date joinDate;
    private String role;
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;
    private String battleTag;
    @OneToMany
    private Set<PlayableCharacter> playableCharacters;

    public User() {
	super();
    }

    public User(Long id, String userId, String firstname, String lastname, String username, String password,
	    String email, String profileImageUrl, Date lastLoginDate, Date lastLoginDateDisplay, Date joinDate,
	    String role, String[] authorities, boolean isActive, boolean isNotLocked, String battleTag,
	    Set<PlayableCharacter> playableCharacters) {
	super();
	this.id = id;
	this.userId = userId;
	this.firstname = firstname;
	this.lastname = lastname;
	this.username = username;
	this.password = password;
	this.email = email;
	this.profileImageUrl = profileImageUrl;
	this.lastLoginDate = lastLoginDate;
	this.lastLoginDateDisplay = lastLoginDateDisplay;
	this.joinDate = joinDate;
	this.role = role;
	this.authorities = authorities;
	this.isActive = isActive;
	this.isNotLocked = isNotLocked;
	this.battleTag = battleTag;
	this.playableCharacters = playableCharacters;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getUserId() {
	return userId;
    }

    public void setUserId(String userId) {
	this.userId = userId;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String passWord) {
	this.password = passWord;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getProfileImageUrl() {
	return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
	this.profileImageUrl = profileImageUrl;
    }

    public Date getLastLoginDate() {
	return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
	this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDateDisplay() {
	return lastLoginDateDisplay;
    }

    public void setLastLoginDateDisplay(Date lastLoginDateDisplay) {
	this.lastLoginDateDisplay = lastLoginDateDisplay;
    }

    public Date getJoinDate() {
	return joinDate;
    }

    public void setJoinDate(Date joinDate) {
	this.joinDate = joinDate;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public String[] getAuthorities() {
	return authorities;
    }

    public void setAuthorities(String[] authorities) {
	this.authorities = authorities;
    }

    public boolean isActive() {
	return isActive;
    }

    public void setActive(boolean isActive) {
	this.isActive = isActive;
    }

    public boolean isNotLocked() {
	return isNotLocked;
    }

    public void setNotLocked(boolean isNotLocked) {
	this.isNotLocked = isNotLocked;
    }

    public String getBattleTag() {
	return battleTag;
    }

    public void setBattleTag(String battleTag) {
	this.battleTag = battleTag;
    }

    public Set<PlayableCharacter> getPlayableCharacters() {
	return playableCharacters;
    }

    public void setPlayableCharacters(Set<PlayableCharacter> playableCharacters) {
	this.playableCharacters = playableCharacters;
    }

    public static long getSerialversionuid() {
	return serialVersionUID;
    }

}