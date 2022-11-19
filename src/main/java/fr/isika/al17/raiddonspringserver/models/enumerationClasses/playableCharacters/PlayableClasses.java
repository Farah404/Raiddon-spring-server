package fr.isika.al17.raiddonspringserver.models.enumerationClasses.playableCharacters;

public enum PlayableClasses {
    
    DEATH_KNIGHT("Death Knight"), 
    DRUID("Druid"), 
    HUNTER("Hunter"), 
    MAGE("Mage"),
    PALADIN("Paladin"),
    PRIEST("Priest"),
    ROGUE("Rogue"),
    SHAMAN("Shaman"),
    WARLOCK("Warlock"),
    WARRIOR("Warrior");
    
    private String label;
    
    private PlayableClasses(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
