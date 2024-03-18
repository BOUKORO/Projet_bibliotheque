package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Livre;
import com.bibliotheque.bibliotheque.Repository.LivreRepository;

import java.util.List;

public class LivreServiceImpl implements LivreService{

    private LivreRepository livreRepository;
    @Override
    public Livre creer(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public List<Livre> lire() {
        return livreRepository.findAll();
    }

    @Override
    public Livre modifier(Long id_livre, Livre livre) {
        return null;
    }

    @Override
    public String supprimer(Long id_livre) {
        livreRepository.deleteById(id_livre);
        return "SUppression de livre est ok";
    }
}
