package fr.isika.al17.raiddonspringserver.dao.personRepository;

import org.springframework.data.repository.CrudRepository;

import fr.isika.al17.raiddonspringserver.models.personManagement.UserAccount;

public interface UserAccountRepository extends CrudRepository<UserAccount, Integer> {

}
