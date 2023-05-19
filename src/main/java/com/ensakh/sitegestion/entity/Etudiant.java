package com.ensakh.sitegestion.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@ToString
@Table
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etd")
    private Long id;
    @Column(name = "nom_etd")
    private String nom;
    @Column(name = "prenom_etd")
    private String prenom;
    @ManyToOne()
    private Filiere filiere;
    @ManyToMany()
    private List<Element> elements;



}
