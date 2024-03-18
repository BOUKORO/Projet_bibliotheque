package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Emprute;

import java.util.List;

public interface EmpruteService {

    Emprute creer(Emprute emprute);

    List<Emprute> lire();

    Emprute modifier(Long id_emp, Emprute emprute);

    String supprimer(Long id_emp);
}
