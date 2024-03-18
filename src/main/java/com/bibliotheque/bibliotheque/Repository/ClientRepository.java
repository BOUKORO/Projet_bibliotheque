package com.bibliotheque.bibliotheque.Repository;

import com.bibliotheque.bibliotheque.Modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
