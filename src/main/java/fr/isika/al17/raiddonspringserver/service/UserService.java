package fr.isika.al17.raiddonspringserver.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.User;
import fr.isika.al17.raiddonspringserver.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	

	public User addUser(User user) {
		return repository.save(user);
	}

	public List<User> getUsers() {
		List<User> users = repository.findAll();
		return users;
	}

	public void deleteUser(User user) {
		repository.delete(user);
	}
}
