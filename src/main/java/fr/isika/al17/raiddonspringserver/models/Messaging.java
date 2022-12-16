package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Messaging {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private User userSender;
    @OneToOne
    private User userReceiver;

    private String subject;

    private String message;

    public Messaging() {
	super();
    }

    public Messaging(Long id, User userSender, User userReceiver, String subject, String message) {
	super();
	this.id = id;
	this.userSender = userSender;
	this.userReceiver = userReceiver;
	this.subject = subject;
	this.message = message;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public User getUserSender() {
	return userSender;
    }

    public void setUserSender(User userSender) {
	this.userSender = userSender;
    }

    public User getUserReceiver() {
	return userReceiver;
    }

    public void setUserReceiver(User userReceiver) {
	this.userReceiver = userReceiver;
    }

    public String getSubject() {
	return subject;
    }

    public void setSubject(String subject) {
	this.subject = subject;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

}
