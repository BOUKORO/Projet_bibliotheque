package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EDITON")
@Setter
@Getter
@NoArgsConstructor
public class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_edit;
    @Column(length = 50)
    private String libelle_edit;
}
