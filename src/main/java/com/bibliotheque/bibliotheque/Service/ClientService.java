package com.bibliotheque.bibliotheque.Service;

import com.bibliotheque.bibliotheque.Modele.Client;

import java.util.List;

public interface ClientService {
    Client creer(Client client);

    List<Client> lire();

    Client modifier(Long id_cli, Client client);

    String supprimmer(Long id_cli);
}
