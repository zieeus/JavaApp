package com.ensakh.sitegestion.repository;

import com.ensakh.sitegestion.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {
    Compte findByEmail(String email);
}
