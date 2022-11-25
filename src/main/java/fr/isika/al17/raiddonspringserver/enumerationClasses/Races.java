package fr.isika.al17.raiddonspringserver.enumerationClasses;

public enum Races {
    
    HUMAN("Human"), 
    DWARF("Dwarf"), 
    NIGHT_ELF("Night Elf"),
    DRAENEI("Draenei"),
    ORC("Orc"), 
    UNDEAD("Undead"), 
    TAUREN("Tauren"),
    TROLL("Troll"),
    BLOOD_ELF("Blood Elf");
    
    private String label;
    
    private Races(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
