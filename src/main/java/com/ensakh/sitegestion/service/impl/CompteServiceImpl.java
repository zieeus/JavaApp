package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Compte;
import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.entity.Role;
import com.ensakh.sitegestion.repository.CompteRepository;
import com.ensakh.sitegestion.repository.ProfesseurRepository;
import com.ensakh.sitegestion.service.CompteService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class CompteServiceImpl implements CompteService {
    @Autowired
    private CompteRepository compteRepository;


    public CompteServiceImpl(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @Override
    public Compte save(Compte compte) {
        Compte compte1 = new Compte(compte.getEmail(),new BCryptPasswordEncoder().encode(compte.getMdp()),compte.getRole());
        return compteRepository.save(compte1);
    }

    @Override
    public List<Compte> getAll() {
        return compteRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Compte compte = compteRepository.findByEmail(username);
        System.out.println("hiiiiiiiiiiiiiii -------------"+username);

        if (compte == null) {
            throw new UsernameNotFoundException("Invalid email or password.");
        }
        Role role = compte.getRole();
        return new org.springframework.security.core.userdetails.User(compte.getEmail(), compte.getMdp(), Collections.singleton(new SimpleGrantedAuthority(role.getNom())));
    }

    public void deleteUser(Long id) {
        Compte user = compteRepository.findById(id).get();

        compteRepository.delete(user);
    }




}
