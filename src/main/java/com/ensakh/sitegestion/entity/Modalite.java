package com.ensakh.sitegestion.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
@Entity
public class Modalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_moda")
    private String nom;
    @Column(name = "coeff_moda")
    private int coefficient;
    @ManyToOne
    private Element element;
    private Float note_modalite;
}
