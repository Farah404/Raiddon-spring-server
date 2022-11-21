package fr.isika.al17.raiddonspringserver.models.personManagement;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

import fr.isika.al17.raiddonspringserver.models.playableCharacterManagement.PlayableCharacter;

@Entity
public class UserAccount extends Account {

    @NotNull
    @PrimaryKeyJoinColumn(name = "id")
    private String battleTag;

    @OneToMany
    private Set<PlayableCharacter> playableCharacters;

    public UserAccount() {
	super();
    }

    public UserAccount(@NotNull String battleTag, Set<PlayableCharacter> playableCharacters) {
	super();
	this.battleTag = battleTag;
	this.playableCharacters = playableCharacters;
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

}
