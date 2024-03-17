package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "AUTEUR")
@Setter
@Getter
@NoArgsConstructor
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aut;
    @Column(length = 50)
    private String nom_aut;
    @Column(length = 50)
    private String prenom_aut;
    private Data date_naissance_aut;
}

