package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Module;
import com.ensakh.sitegestion.repository.ModuleRepository;
import com.ensakh.sitegestion.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public List<Module> getAll() {
        return moduleRepository.findAll();
    }
}
