package com.ensakh.sitegestion.entity;

import lombok.*;

import javax.persistence.*;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email_compte"))
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_compte")
    private Long id;

    @NonNull
    @Column(name = "email_compte")
    private String email;
    @NonNull
    @Column(name = "mdp_compte")
    private String mdp;
    @NonNull
    @ManyToOne()
    private Role role;

    @OneToOne()
    private Professeur prof;



}
