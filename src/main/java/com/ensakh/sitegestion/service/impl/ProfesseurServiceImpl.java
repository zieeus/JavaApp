package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.repository.ProfesseurRepository;
import com.ensakh.sitegestion.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProfesseurServiceImpl implements ProfesseurService {
    @Autowired
    private ProfesseurRepository professeurRepository;

    public ProfesseurServiceImpl(ProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    @Override
    public List<Professeur> getAll() {
        return professeurRepository.findAll();
    }

    @Override
    public Optional<Professeur> getById(Long id) {

        return professeurRepository.findById(id);
    }

    @Override
    public Professeur saveProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

}
