package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Emprute;
import com.bibliotheque.bibliotheque.Repository.EmpruteRepository;

import java.util.List;

public class EmpruteServiceImpl implements EmpruteService{

    private EmpruteRepository empruteRepository;
    @Override
    public Emprute creer(Emprute emprute) {
        return empruteRepository.save(emprute) ;
    }

    @Override
    public List<Emprute> lire() {
        return empruteRepository.findAll();
    }

    @Override
    public Emprute modifier(Long id_emp, Emprute emprute) {
        return null;
    }

    @Override
    public String supprimer(Long id_emp) {
        empruteRepository.deleteById(id_emp);
        return "Suppression de emprute est ok";
    }
}
