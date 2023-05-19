package com.ensakh.sitegestion.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Data
@ToString
@Entity
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom_elem")
    private String nom;
    @ManyToOne
    private Module module;
    private Boolean isValide;
    @OneToMany(mappedBy = "element")
    private List<Modalite> modalites;

    @ManyToMany(mappedBy = "elements")
    private List<Etudiant> etudiants;
    @ManyToOne()
    private Professeur prof;
    private Float note_final;
}
