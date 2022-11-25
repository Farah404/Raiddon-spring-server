package fr.isika.al17.raiddonspringserver.service;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.web.multipart.MultipartFile;

import fr.isika.al17.raiddonspringserver.exception.EmailExistsException;
import fr.isika.al17.raiddonspringserver.exception.EmailNotFoundException;
import fr.isika.al17.raiddonspringserver.exception.NotAnImageFileException;
import fr.isika.al17.raiddonspringserver.exception.UserNotFoundException;
import fr.isika.al17.raiddonspringserver.exception.UsernameExistsException;
import fr.isika.al17.raiddonspringserver.models.User;

public interface UserService {
    
    User register(String firstName, String lastName, String userName, String email) throws UserNotFoundException, UsernameExistsException, EmailExistsException, MessagingException;
	
	List<User> getUsers();
	
	User findByUsername(String userName);
	
	User findByEmail(String email);
	
	User addNewUser(String firstName, String lastName, String userName, String email, String role, boolean isNotLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException, NotAnImageFileException, MessagingException;
	
	User updateUser(String currentUserName, String newFirstName, String newLastName, String newUserName, String newEmail, String role, boolean isNotLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException, NotAnImageFileException;

	void deleteUser(String username) throws IOException, UserNotFoundException;
	
	void resetPassWord(String email) throws EmailNotFoundException, MessagingException;
	
	User updateProfileImage(String userName, MultipartFile profileImage) throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException, NotAnImageFileException;

}
