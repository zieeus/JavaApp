package com.ensakh.sitegestion.repository;

import com.ensakh.sitegestion.entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur,Long> {
    
}
