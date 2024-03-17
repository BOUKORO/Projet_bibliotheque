package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

@Entity
@Table(name = "PAYS")
@Setter
@Getter
@NoArgsConstructor

public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pays;
    @Column(length = 50)
    private String Libelle_pays;

}
