package fr.isika.al17.raiddonspringserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.isika.al17.raiddonspringserver.enumeration_classes.ERole;
import fr.isika.al17.raiddonspringserver.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
