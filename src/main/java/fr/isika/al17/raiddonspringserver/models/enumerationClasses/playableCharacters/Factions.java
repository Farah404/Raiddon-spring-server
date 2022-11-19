package fr.isika.al17.raiddonspringserver.models.enumerationClasses.playableCharacters;

public enum Factions {
    
    ALLIANCE("Alliance"), 
    HORDE("Horde");
    
    private String label;
    
    private Factions(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
