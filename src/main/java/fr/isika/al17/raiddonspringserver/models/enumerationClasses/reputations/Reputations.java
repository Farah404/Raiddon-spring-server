package fr.isika.al17.raiddonspringserver.models.enumerationClasses.reputations;

public enum Reputations {
    
    ALLIANCE_VANGUARD("Alliance Vanguard"), 
    HORDE_EXPEDITION("Horde Expedition"), 
    ARGENT_CRUSADE("Argent Crusate"),
    KIRIN_TOR("Kirin Tor"),
    KNIGHTS_EBONE_BLADE("Knights of the Ebone Blade"),
    WYRMEST_ACCORD("The Wyrmest Accord"),
    KALUAK("The Kaluak"),
    SONS_HODIR("The sons of Hodir"),
    FRENZY_HEART("Frenzy heart tribe"),
    ORACLES("The Oracles");
    private String label;
    
    private Reputations(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
