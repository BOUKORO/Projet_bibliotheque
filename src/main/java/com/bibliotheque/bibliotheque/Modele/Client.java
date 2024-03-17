package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CLIENT")
@Setter
@Getter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cli;
    @Column(length = 50)
    private String nom_cli;
    @Column(length = 50)
    private String prenom_cli;
    @Column(length = 50)
    private String email_cli;
    @Column(length = 50)
    private String ville_cli;
    private Integer telephone;
    @Column(length = 50)
    private String adresse_cli;
    private Data data_naissance_cli;
}
