<<<<<<< Updated upstream
package fr.isika.al17.raiddonspringserver.enumerationClasses;
=======
package fr.isika.al17.raiddonspringserver.enumeration_classes;
>>>>>>> Stashed changes

public enum GuildRanks {

    GUILD_MASTER("Guild Master"), 
    GUILD_OFFICER("Guild Officer"),
    GUILD_MEMBER("Guild Member");
    
    private String label;
    
    private GuildRanks(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
