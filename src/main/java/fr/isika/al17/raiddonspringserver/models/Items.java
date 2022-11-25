package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import fr.isika.al17.raiddonspringserver.enumerationClasses.ArmorType;
import fr.isika.al17.raiddonspringserver.enumerationClasses.SlotTypes;

@Entity
public class Items {

    @Id
    @GeneratedValue
    private Integer id;

    private String itemName;
    private String itemDropZone;
    private String itemDropEncounter;
    private Integer iLevel;
    private ArmorType armorType;
    private SlotTypes slotTypes;

    public Items() {
	super();
    }

    public Items(Integer id, String itemName, String itemDropZone, String itemDropEncounter, Integer iLevel,
	    ArmorType armorType, SlotTypes slotTypes) {
	super();
	this.id = id;
	this.itemName = itemName;
	this.itemDropZone = itemDropZone;
	this.itemDropEncounter = itemDropEncounter;
	this.iLevel = iLevel;
	this.armorType = armorType;
	this.slotTypes = slotTypes;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getItemName() {
	return itemName;
    }

    public void setItemName(String itemName) {
	this.itemName = itemName;
    }

    public String getItemDropZone() {
	return itemDropZone;
    }

    public void setItemDropZone(String itemDropZone) {
	this.itemDropZone = itemDropZone;
    }

    public String getItemDropEncounter() {
	return itemDropEncounter;
    }

    public void setItemDropEncounter(String itemDropEncounter) {
	this.itemDropEncounter = itemDropEncounter;
    }

    public Integer getiLevel() {
	return iLevel;
    }

    public void setiLevel(Integer iLevel) {
	this.iLevel = iLevel;
    }

    public ArmorType getArmorType() {
	return armorType;
    }

    public void setArmorType(ArmorType armorType) {
	this.armorType = armorType;
    }

    public SlotTypes getSlotTypes() {
	return slotTypes;
    }

    public void setSlotTypes(SlotTypes slotTypes) {
	this.slotTypes = slotTypes;
    }

}
