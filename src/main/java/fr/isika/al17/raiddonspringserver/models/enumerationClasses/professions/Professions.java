package fr.isika.al17.raiddonspringserver.models.enumerationClasses.professions;

public enum Professions {
    
    ALCHEMY("Alchemy"), 
    BLACKSMITHING("Blacksmithing"), 
    ENCHANTING("Enchanting"), 
    ENGINEERING("Engineering"),
    INSCRIPTION("Inscription"),
    JEWEL_CRAFTING("Jewel Crafting"),
    LEATHER_WORKING("Leather Working"),
    TAILORING("Tailoring");
    
    private String label;
    
    private Professions(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
