package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

@Entity
@Table(name = "TYPE_LIVRE")
@Setter
@Getter
@NoArgsConstructor

public class Type_livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_type_livre;
    @Column(length = 50)
    private String libelle_type;
}
