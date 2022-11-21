package fr.isika.al17.raiddonspringserver.models.enumerationClasses.equipments;

public enum LootSystems {

    RAND("Guild Master"), 
    ATTRIBUTION("Guild Officer"),
    DRAGON_KILL_POINTS("DKP Dragon Kill Points"),
    GOLD_DRAGON_KILL_POINTS("Gold Dragon Kill Points");
    
    private String label;
    
    private LootSystems(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
