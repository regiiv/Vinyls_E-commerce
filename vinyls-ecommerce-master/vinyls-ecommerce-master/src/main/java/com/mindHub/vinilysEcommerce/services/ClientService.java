package com.mindHub.vinilysEcommerce.services;

import com.mindHub.vinilysEcommerce.models.Client;

import java.util.List;

public interface ClientService {

    public void saveClient(Client client);

    public List<Client> getAllClients();

    public Client getClientByEmail(String email);

    public void sendVerificationMail(String email, String subject, String body);

    public Client getClienteById (long id);
}
