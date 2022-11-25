package fr.isika.al17.raiddonspringserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al17.raiddonspringserver.models.User;


public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByUsername (String username);
    
    User findByEmail (String email);
    
    User findByBattleTag (String battleTag);
}