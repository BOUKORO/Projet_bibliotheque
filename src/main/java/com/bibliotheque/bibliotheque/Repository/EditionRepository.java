package com.bibliotheque.bibliotheque.Repository;

import com.bibliotheque.bibliotheque.Modele.Edition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditionRepository extends JpaRepository<Edition,Long> {
}
