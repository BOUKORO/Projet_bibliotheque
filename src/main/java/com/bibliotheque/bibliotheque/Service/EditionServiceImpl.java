package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Edition;
import com.bibliotheque.bibliotheque.Repository.EditionRepository;

import java.util.List;

public class EditionServiceImpl implements EditonService {

    private EditionRepository editionRepository;

    @Override
    public Edition creer(Edition edition) {
        return editionRepository.save(edition);
    }

    @Override
    public List<Edition> lire() {
        return editionRepository.findAll();
    }

    @Override
    public Edition modifier(Long id_edit, Edition edition) {
        return null;
    }

    @Override
    public String supprimer(Long id_edit) {
        editionRepository.deleteById(id_edit);
        return "suppression ok de Edition";
    }
}
