package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Type_livre;

import java.util.List;

public interface Type_livreService {
    Type_livre creer(Type_livre type_livre);

    List<Type_livre> lire();

    Type_livre modifier(Long id_type_livre, Type_livre type_livre);

    String supprimer(Long id_type_livre);
}
