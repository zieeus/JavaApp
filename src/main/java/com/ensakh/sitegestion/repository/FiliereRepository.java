package com.ensakh.sitegestion.repository;

import com.ensakh.sitegestion.entity.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere,Long> {

}
