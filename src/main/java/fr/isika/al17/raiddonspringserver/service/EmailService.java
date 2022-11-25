package fr.isika.al17.raiddonspringserver.service;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.mail.smtp.SMTPTransport;

import fr.isika.al17.raiddonspringserver.constant.EmailConfidential;
import fr.isika.al17.raiddonspringserver.constant.EmailConstant;

@Service
public class EmailService {

    private EmailConfidential emailConfidential;

    @Autowired
    public EmailService(EmailConfidential emailConfidential) {
	this.emailConfidential = emailConfidential;
    }

    public void sendNewPassWordEmail(String firstName, String passWord, String email) throws MessagingException {
	Message message = createEmail(firstName, passWord, email);
	SMTPTransport smtpTransport = (SMTPTransport) getEmailSession()
		.getTransport(EmailConstant.SIMPLE_MAIL_TRANSFER_PROTOCOL);
	smtpTransport.connect(EmailConstant.GMAIL_SMTP_SERVER, emailConfidential.getUsername(),
		emailConfidential.getPassword());
	smtpTransport.sendMessage(message, message.getAllRecipients());
	smtpTransport.close();
    }

    private Message createEmail(String firstName, String passWord, String email)
	    throws AddressException, MessagingException {
	Message message = new MimeMessage(getEmailSession());
	message.setFrom(new InternetAddress(EmailConstant.FROM_EMAIL));
	message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email, false));
	message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(EmailConstant.CC_EMAIL, false));
	message.setSubject(EmailConstant.EMAIL_SUBJECT);
	message.setText("Hello " + firstName + ", " + "\n \nYour new account password is: " + passWord
		+ "\n \nThe Support Team of Raiddon.");
	message.setSentDate(new Date());
	message.saveChanges();
	return message;
    }

    private Session getEmailSession() {

	Properties properties = System.getProperties();
	properties.put(EmailConstant.SMTP_HOST, EmailConstant.GMAIL_SMTP_SERVER);
	properties.put(EmailConstant.SMTP_AUTH, true);
	properties.put(EmailConstant.SMTP_PORT, EmailConstant.DEFAULT_PORT);
	properties.put(EmailConstant.SMTP_HOST, EmailConstant.GMAIL_SMTP_SERVER);
	properties.put(EmailConstant.SMTP_STARTTLS_ENABLE, true);
	properties.put(EmailConstant.SMTP_STARTTLS_REQUIRED, true);
	return Session.getInstance(properties, null);

    }

}
