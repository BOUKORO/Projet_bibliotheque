package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Livre;

import java.util.List;

public interface LivreService {

    Livre creer (Livre livre);

    List<Livre> lire();

    Livre modifier(Long id_livre, Livre livre);

    String supprimer(Long id_livre);
}
