package com.ensakh.sitegestion.service;

import com.ensakh.sitegestion.entity.Element;
import com.ensakh.sitegestion.entity.Professeur;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ElementService {
    List<Element> getAll();
}
