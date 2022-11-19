package fr.isika.al17.raiddonspringserver.models.personManagement;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

import fr.isika.al17.raiddonspringserver.models.playableCharactersManagement.PlayableCharacter;

@Entity
public class UserAccount extends Account{
    
    @NotNull
    @PrimaryKeyJoinColumn(name = "id")
    private String battleTag;
    
    @OneToMany
    private PlayableCharacter playableCharacter;

}
