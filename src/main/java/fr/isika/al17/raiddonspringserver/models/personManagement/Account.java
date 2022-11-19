package fr.isika.al17.raiddonspringserver.models.personManagement;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    
    @Id
    @GeneratedValue
    private Integer id;
   
    @NotNull
    private String lastname;
    
    @NotNull
    private String firstname;
    
    @NotNull
    @Length(min=5, message = "Your username should be at least 5 characters long")
    private String username;
    
    @NotNull
    @Email(message="Please provide a valid email address")
    @Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
    private String email;
    
    @NotNull
    @Length(min=5, message = "Your password should be at least 5 characters long")
    @Pattern(regexp="^(?=.*\\d)(?=.*[A-Z]).{6,8}$", message="Your password shoule contain at lease one special character, one upper case letter and one number")
    private String password;
    
    @NotNull
    private String congirmPassword;
    
    @NotNull
    private Date dateOfBirth;
    
    @NotNull
    private LocalDateTime creationDate;


    public Account() {
	super();
    }

    public Account(Integer id, @NotNull String lastname, @NotNull String firstname,
	    @NotNull @Length(min = 5, message = "Your username should be at least 5 characters long") String username,
	    @NotNull @Email(message = "Please provide a valid email address") @Pattern(regexp = ".+@.+\\..+", message = "Please provide a valid email address") String email,
	    @NotNull @Length(min = 5, message = "Your password should be at least 5 characters long") @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z]).{6,8}$", message = "Your password shoule contain at lease one special character, one upper case letter and one number") String password,
	    @NotNull String congirmPassword, @NotNull Date dateOfBirth, @NotNull LocalDateTime creationDate) {
	super();
	this.id = id;
	this.lastname = lastname;
	this.firstname = firstname;
	this.username = username;
	this.email = email;
	this.password = password;
	this.congirmPassword = congirmPassword;
	this.dateOfBirth = dateOfBirth;
	this.creationDate = creationDate;
    }



    public Integer getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCongirmPassword() {
        return congirmPassword;
    }

    public void setCongirmPassword(String congirmPassword) {
        this.congirmPassword = congirmPassword;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
	return "Account [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", username=" + username
		+ ", email=" + email + ", password=" + password + ", congirmPassword=" + congirmPassword
		+ ", dateOfBirth=" + dateOfBirth + ", creationDate=" + creationDate + "]";
    }

}
