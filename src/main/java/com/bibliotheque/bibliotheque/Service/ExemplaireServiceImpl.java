package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Exemplaire;
import com.bibliotheque.bibliotheque.Repository.ExemplaireRepository;

import java.util.List;

public class ExemplaireServiceImpl implements ExemplaireService{

    private ExemplaireRepository exemplaireRepository;
    @Override
    public Exemplaire creer(Exemplaire exemplaire) {
        return exemplaireRepository.save(exemplaire);
    }

    @Override
    public List<Exemplaire> lire() {
        return exemplaireRepository.findAll();
    }

    @Override
    public Exemplaire modifier(Long id_exemp, Exemplaire exemplaire) {
        return null;
    }

    @Override
    public String supprimer(Long id_exemp) {
        exemplaireRepository.deleteById(id_exemp);
        return "suppression ok";
    }
}
