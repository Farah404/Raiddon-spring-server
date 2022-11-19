package fr.isika.al17.raiddonspringserver.models.personManagement;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

@Entity
public class AdministratorAccount extends Account {
    
    @NotNull
    @PrimaryKeyJoinColumn(name = "id")
    private String adminCode;

    public AdministratorAccount() {
	super();
    }

    public AdministratorAccount(@NotNull String adminCode) {
	super();
	this.adminCode = adminCode;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    @Override
    public String toString() {
	return "AdministratorAccount [adminCode=" + adminCode + "]";
    }

}
