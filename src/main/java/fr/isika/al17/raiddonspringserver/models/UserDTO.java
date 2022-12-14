package fr.isika.al17.raiddonspringserver.models;

public class UserDTO {

    private String username;

    private String email;

    private String password;

    private String battleTag;

    private String profilePicture;

    private String guildRank;

    public UserDTO() {
	super();
    }

    public UserDTO(String username, String email, String password, String battleTag, String profilePicture,
	    String guildRank) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.battleTag = battleTag;
	this.profilePicture = profilePicture;
	this.guildRank = guildRank;
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

    public String getGuildRank() {
	return guildRank;
    }

    public void setGuildRank(String guildRank) {
	this.guildRank = guildRank;
    }

}
