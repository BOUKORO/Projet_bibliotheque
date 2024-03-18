package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Client;
import com.bibliotheque.bibliotheque.Repository.ClientRepository;

import java.util.List;

public class ClientServiceImpl implements ClientService{
    private ClientRepository clientRepository;

    @Override
    public Client creer(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> lire() {
        return clientRepository.findAll();
    }

    @Override
    public Client modifier(Long id_cli, Client client) {
        return null;
    }

    @Override
    public String supprimmer(Long id_cli) {
        clientRepository.deleteById(id_cli);
        return "client supprimer";
    }
}
