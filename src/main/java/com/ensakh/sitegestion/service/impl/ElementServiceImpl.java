package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Element;
import com.ensakh.sitegestion.repository.ElementRepository;
import com.ensakh.sitegestion.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementServiceImpl implements ElementService {
    @Autowired
    private ElementRepository elementRepository;


    @Override
    public List<Element> getAll() {
        return elementRepository.findAll();
    }
}
