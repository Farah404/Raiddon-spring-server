package fr.isika.al17.raiddonspringserver.enumerationClasses;

public enum RaidName {
    
    NAXXRAMAS("Naxxramas"),
    OBSIDIAN_SANCTUM("The Obsidian Sanctum"),
    EYE_ETERNITY("The Eye of Eternity"),
    VAULT_ARCHAVON("Vault of Archavon");
    
    private String label;
    
    private RaidName(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
