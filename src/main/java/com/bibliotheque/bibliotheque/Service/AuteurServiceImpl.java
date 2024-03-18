package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Auteur;
import com.bibliotheque.bibliotheque.Repository.AuteurRepository;

import java.util.List;

public class AuteurServiceImpl implements AuteurService{

private AuteurRepository auteurRepository;
    @Override
    public Auteur creer(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public List<Auteur> lire() {
        return auteurRepository.findAll();
    }

    @Override
    public Auteur modifier(Long id_aut, Auteur auteur) {
        return null;
    }

    @Override
    public String supprimer(Long id_aut) {
       auteurRepository.deleteById(id_aut);
       return "suppresion ok";
    }
}
