package fr.isika.al17.raiddonspringserver.enumerationClasses;

public enum SlotTypes {

    HEAD("Head"), 
    SHOULDER("Shoulder"),
    BACK("Back"), 
    CHEST("Chest"),
    WRIST("Wrist"),
    HAND("Hand"),
    WAIST("Waist"),
    LEGS("Legs"),
    FEET("Feet"),
    NECK("Neck"),
    RING("Ring"),
    TRINKET("Trinket"),
    MAIN_HAND("Main Hand"),
    OFF_HAND("Off Hand"),
    RELIC("Relic");
    
    private String label;
    
    private SlotTypes(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
