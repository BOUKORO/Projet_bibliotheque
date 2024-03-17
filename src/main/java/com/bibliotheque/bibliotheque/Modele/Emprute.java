package com.bibliotheque.bibliotheque.Modele;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMPRUTE")
@Setter
@Getter
@NoArgsConstructor
public class Emprute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_emp;
    @Column(length = 10)
    private String delais_emp;
    private Data date_emp;
}
