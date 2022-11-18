package fr.isika.al17.raiddonspringserver.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.isika.al17.raiddonspringserver.models.Insured;

public interface InsuredRepository extends CrudRepository<Insured, Integer>{
    
    List<Insured> findByPersonNumber (Long personNumber);

}
