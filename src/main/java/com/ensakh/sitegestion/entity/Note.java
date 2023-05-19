package com.ensakh.sitegestion.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Modalite modalite;
    private Float valeur;

}
