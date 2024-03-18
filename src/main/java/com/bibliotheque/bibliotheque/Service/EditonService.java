package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Edition;

import java.util.List;

public interface EditonService {
    Edition creer(Edition edition);

    List<Edition> lire();

    Edition modifier (Long id_edit, Edition edition);

    String supprimer(Long id_edit);
}
