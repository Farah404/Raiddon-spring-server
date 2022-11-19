package fr.isika.al17.raiddonspringserver.models.enumerationClasses.equipments;

public enum ArmorType {
    
    PLATE("Plate"),
    MAIL("Mail"),
    LEATHER("Leather"),
    CLOTH("Cloth");
    
    private String label;
    
    private ArmorType(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
