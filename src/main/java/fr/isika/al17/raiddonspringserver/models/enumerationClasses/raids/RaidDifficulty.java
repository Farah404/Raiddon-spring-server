package fr.isika.al17.raiddonspringserver.models.enumerationClasses.raids;

public enum RaidDifficulty {
    
    TEN_PLAYERS("10 players party"),
    TWENTY_FIVE_PLAYERS("25 players party");
    
    private String label;
    
    private RaidDifficulty(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
