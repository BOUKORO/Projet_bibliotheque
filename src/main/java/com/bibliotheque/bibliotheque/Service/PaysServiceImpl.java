package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Pays;
import com.bibliotheque.bibliotheque.Repository.PaysRepository;

import java.util.List;

public class PaysServiceImpl implements PaysService{

    private PaysRepository paysRepository;

    @Override
    public Pays creer(Pays pays) {
        return paysRepository.save(pays);
    }

    @Override
    public List<Pays> lire() {
        return paysRepository.findAll();
    }

    @Override
    public Pays modifier(Long id_pays, Pays pays) {
        return null;
    }

    @Override
    public String supprimer(Long id_pays) {

        paysRepository.deleteById(id_pays);
        return "SUppression de pays est ok";
    }
}
