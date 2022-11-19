package fr.isika.al17.raiddonspringserver.models.enumerationClasses.guilds;

public enum GuildLootSystems {

    RAND("Guild Master"), 
    ATTRIBUTION("Guild Officer"),
    DRAGON_KILL_POINTS("DKP Dragon Kill Points"),
    GOLD_DRAGON_KILL_POINTS("Gold Dragon Kill Points");
    
    private String label;
    
    private GuildLootSystems(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
