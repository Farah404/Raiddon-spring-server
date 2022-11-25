package fr.isika.al17.raiddonspringserver.enumerationClasses;

public enum ProfessionSpecialisation {
    
    MOON_CLOTH("Moon Cloth"), 
    SPELL_FIRE("Spell Fire"), 
    SHADOW_WEAVE("Shadow Weave"),
    
    DRAGON_SCALE("Dragon Scale"), 
    ELEMENTAL("Elemental"), 
    TRIBAL("Tribal"),
    
    MASTER_AXESMITHING("Master Axesmithing"), 
    MASTER_HAMMERSMITHING("Master Hammersmithing"), 
    MASTER_SWORDSMITHING("Master Swordsmithing"),
    MASTER_ARMORSMITHING("Master Armorsmithing"),
    
    MASTER_POTIONS("Master Potions"), 
    MASTER_ELIXIRS("Master Elixirs"), 
    MASTER_TRANSMUTATIONS("Master Transmutations"),
    
    GNOMISH_ENGINEERING("Gnomish Engineering"), 
    GOBLIN_ENGINEERING("Goblin Engineering");
    
    private String label;
    
    private ProfessionSpecialisation(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
