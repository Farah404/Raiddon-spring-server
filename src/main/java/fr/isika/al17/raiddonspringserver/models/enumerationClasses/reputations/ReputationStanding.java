package fr.isika.al17.raiddonspringserver.models.enumerationClasses.reputations;

public enum ReputationStanding {
    
    EXALTED("Exalted"), 
    REVERED("Revered"), 
    HONORED("Honored"),
    FRIENDLY("Friendly"),
    NEUTRAL("Neutral"),
    UNFRIENDLY("Unfriendly"),
    HOSTILE("Hostile"),
    HATED("Hostile");
    private String label;
    
    private ReputationStanding(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
