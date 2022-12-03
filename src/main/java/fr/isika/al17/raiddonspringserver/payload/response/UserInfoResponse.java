package fr.isika.al17.raiddonspringserver.payload.response;

import java.util.List;

import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;

public class UserInfoResponse {
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
    private String battleTag;
    private String profilePicture;
    private PlayableCharacter playableCharacter;

    public UserInfoResponse() {
	super();
    }


    
    public UserInfoResponse(Long id, String username, String email, List<String> roles, String battleTag,
	    String profilePicture, PlayableCharacter playableCharacter) {
	super();
	this.id = id;
	this.username = username;
	this.email = email;
	this.roles = roles;
	this.battleTag = battleTag;
	this.profilePicture = profilePicture;
	this.playableCharacter = playableCharacter;
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

    public List<String> getRoles() {
	return roles;
    }

    public void setRoles(List<String> roles) {
	this.roles = roles;
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
    
    


}
