package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EXEMPLAIRE")
@Setter
@Getter
@NoArgsConstructor
public class Exemplaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exemp;
    @Column(length = 50)
    private String libelle_exemp;
}
