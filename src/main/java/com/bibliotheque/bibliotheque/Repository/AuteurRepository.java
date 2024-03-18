package com.bibliotheque.bibliotheque.Repository;

import com.bibliotheque.bibliotheque.Modele.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur,Long> {
}
