package com.ensakh.sitegestion.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@Data
@ToString
@Entity
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prof", nullable = false)
    private Long id;
    @Column(name = "nom_prof",nullable = false)
    private String nom;
    @Column(name = "prenom_prof",nullable = false)
    private String prenom;
    @Column(name = "code_prof",nullable = false)
    private String code;
    @Column(name = "spec_prof",nullable = false)
    private String specialite;

    @OneToMany(mappedBy = "prof")
    private List<Element> elements;

    @OneToOne(mappedBy = "prof")
    private Compte compte;

}
