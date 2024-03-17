package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "LIVRE")
@Setter
@Getter
@NoArgsConstructor


public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_livre;
    @Column(length = 50)
    private String nom_livre;
    @Column(length = 150)
    private String resume_livre;
    private Date data_livre;

}
