
package fr.isika.al17.raiddonspringserver.enumeration_classes;

public enum LootSystems {

    RAND("Random"), ATTRIBUTION("Attribution by Loot master"), DRAGON_KILL_POINTS("DKP Dragon Kill Points"),
    GOLD_DRAGON_KILL_POINTS("Gold Dragon Kill Points");

    private String label;

    private LootSystems(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
