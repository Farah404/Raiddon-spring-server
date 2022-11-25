package fr.isika.al17.raiddonspringserver.enumerationClasses;

public enum Specialisation {
    
    // DRUID
    BALANCE("Balance"), 
    TREE_RESTORATION("Restoration"),
    FERAL_TANK("Feral Tank"), 
    FERAL_DPS("Feral DPS"),
    
    // HUNTER
    BEAST_MASTERY("Beast Mastery"), 
    MARKSMANSHIP("Marksmanship"), 
    SURVIVAL("Survival"),
    
    // MAGE
    ARCANE("Arcane"), 
    FIRE("Fire"), 
    FROST("Frost"),
    
    // ROGUE
    ASSASSINATION("Assassination"), 
    COMBAT("Combat"), 
    SUBTLETY("Subtlety"),
    
    // PALADIN
    PROTECTION("Protection"), 
    RETRIBUTION("Retribution"), 
    HOLY("Holy"),
    
    // SHAMAN
    ELEMENTAL("Elemental"), 
    ENHANCEMENT("Enhancement"), 
    RESTORATION("Restoration"),
    
    //WARLOCK
    AFFLICTION("Affliction"), 
    DEMONOLOGY("Demonology"), 
    DESTRUCTION("Destruction"),
    
    // WARRIOR
    ARMS("Arms"), 
    FURY("Fury"), 
    TANK("Protection"),
    
    //DEATHKNIGHT
    BLOOD("Blood"), 
    FROST_KNIGHT("Frost"), 
    UNHOLY("Unholy"),
    
    // PRIEST
    DISCIPLINE("Discipline"), 
    PRIEST_HOLY("Holy"), 
    SHADOW("Shadow");
	    
    private String label;
    
    private Specialisation(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
