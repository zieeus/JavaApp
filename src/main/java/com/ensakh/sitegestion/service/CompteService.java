package com.ensakh.sitegestion.service;

import com.ensakh.sitegestion.entity.Compte;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface CompteService extends UserDetailsService{
    Compte save(Compte compte);
    List<Compte> getAll();
    void deleteUser(Long id);
}
