package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Filiere;
import com.ensakh.sitegestion.repository.FiliereRepository;
import com.ensakh.sitegestion.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FiliereServiceImpl implements FiliereService {
    @Autowired
    private FiliereRepository filiereRepository;

    public FiliereServiceImpl(FiliereRepository filiereRepository) {
        this.filiereRepository = filiereRepository;
    }

    @Override
    public List<Filiere> getAll() {
        return filiereRepository.findAll();
    }
}
