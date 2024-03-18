package com.bibliotheque.bibliotheque.Repository;

import com.bibliotheque.bibliotheque.Modele.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemplaireRepository extends JpaRepository<Exemplaire, Long> {
}
