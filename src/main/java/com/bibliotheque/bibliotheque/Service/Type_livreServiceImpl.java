package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Type_livre;
import com.bibliotheque.bibliotheque.Repository.Type_livreRepository;

import java.util.List;

public class Type_livreServiceImpl implements Type_livreService{

    private Type_livreRepository type_livreRepository;

    @Override
    public Type_livre creer(Type_livre type_livre) {
        return type_livreRepository.save(type_livre);
    }

    @Override
    public List<Type_livre> lire() {
        return type_livreRepository.findAll();
    }

    @Override
    public Type_livre modifier(Long id_type_livre, Type_livre type_livre) {
        return null;
    }

    @Override
    public String supprimer(Long id_type_livre) {
        type_livreRepository.deleteById(id_type_livre);
        return "Suppression ok";
    }
}
