package fr.isika.al17.raiddonspringserver.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailConfidential {

    @Value("${email.username}")
    private String username;
    @Value("${email.password}")
    private String password;

    public EmailConfidential() {
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

}
