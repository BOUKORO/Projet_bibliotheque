package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Auteur;

import java.util.List;

public interface AuteurService {
     Auteur creer(Auteur auteur);

     List<Auteur> lire();

     Auteur modifier(Long id_aut, Auteur auteur);

     String supprimer(Long id_aut);
}
