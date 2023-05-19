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
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sem")
    private Long id;
    @Column(name = "nom_sem")
    private String nom;
    @OneToMany(mappedBy = "semestre")
    private List<Module> modules;


}
