package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    @GeneratedValue
    private Integer id;

    private String itemName;
    private String itemDropZone;
    private String itemDropEncounter;

    public Items() {
	super();
    }

    public Items(Integer id, String itemName, String itemDropZone, String itemDropEncounter) {
	super();
	this.id = id;
	this.itemName = itemName;
	this.itemDropZone = itemDropZone;
	this.itemDropEncounter = itemDropEncounter;
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

}
