package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Exemplaire;

import java.util.List;

public interface ExemplaireService {

    Exemplaire creer(Exemplaire exemplaire);

    List<Exemplaire> lire();

    Exemplaire modifier(Long id_exemp, Exemplaire exemplaire);

    String supprimer(Long id_exemp);
}
