package com.ensakh.sitegestion.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
public class Role {
    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Column(name = "nom_role")
    private String nom;
    @OneToMany(mappedBy = "role")
    private List<Compte> comptes;
}
