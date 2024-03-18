package com.bibliotheque.bibliotheque.Repository;

import com.bibliotheque.bibliotheque.Modele.Emprute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruteRepository extends JpaRepository<Emprute, Long> {
}
