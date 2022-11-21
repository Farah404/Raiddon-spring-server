package fr.isika.al17.raiddonspringserver.dao.personRepository;

import org.springframework.data.repository.CrudRepository;

import fr.isika.al17.raiddonspringserver.models.personManagement.AdministratorAccount;

public interface AdministratorAccountRepository extends CrudRepository<AdministratorAccount, Integer>{
}