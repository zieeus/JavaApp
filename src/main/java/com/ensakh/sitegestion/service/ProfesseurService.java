package com.ensakh.sitegestion.service;

import com.ensakh.sitegestion.entity.Professeur;

import java.util.List;
import java.util.Optional;

public interface ProfesseurService {
    List<Professeur> getAll();
    Optional<Professeur> getById(Long id);

    Professeur saveProfesseur(Professeur professeur);

}
