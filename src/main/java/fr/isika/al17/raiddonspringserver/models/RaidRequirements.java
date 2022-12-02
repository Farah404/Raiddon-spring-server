package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RaidRequirements {

    @Id
    @GeneratedValue
    private Long id;

    private String mainClass;
    private String secondaryClass;
    private String mainSpec;
    private String secondarySpec;
    private String mainRole;
    private String secondaryRole;

    public RaidRequirements() {
	super();
    }

    public RaidRequirements(Long id, String mainClass, String secondaryClass, String mainSpec, String secondarySpec,
	    String mainRole, String secondaryRole) {
	super();
	this.id = id;
	this.mainClass = mainClass;
	this.secondaryClass = secondaryClass;
	this.mainSpec = mainSpec;
	this.secondarySpec = secondarySpec;
	this.mainRole = mainRole;
	this.secondaryRole = secondaryRole;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getMainClass() {
	return mainClass;
    }

    public void setMainClass(String mainClass) {
	this.mainClass = mainClass;
    }

    public String getSecondaryClass() {
	return secondaryClass;
    }

    public void setSecondaryClass(String secondaryClass) {
	this.secondaryClass = secondaryClass;
    }

    public String getMainSpec() {
	return mainSpec;
    }

    public void setMainSpec(String mainSpec) {
	this.mainSpec = mainSpec;
    }

    public String getSecondarySpec() {
	return secondarySpec;
    }

    public void setSecondarySpec(String secondarySpec) {
	this.secondarySpec = secondarySpec;
    }

    public String getMainRole() {
	return mainRole;
    }

    public void setMainRole(String mainRole) {
	this.mainRole = mainRole;
    }

    public String getSecondaryRole() {
	return secondaryRole;
    }

    public void setSecondaryRole(String secondaryRole) {
	this.secondaryRole = secondaryRole;
    }

}
