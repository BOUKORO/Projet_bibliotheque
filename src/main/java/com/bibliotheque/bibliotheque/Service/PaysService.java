package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Pays;

import java.util.List;

public interface PaysService {
    Pays creer(Pays pays);

    List<Pays> lire();

    Pays modifier(Long id_pays,Pays pays);

    String supprimer(Long id_pays);
}
