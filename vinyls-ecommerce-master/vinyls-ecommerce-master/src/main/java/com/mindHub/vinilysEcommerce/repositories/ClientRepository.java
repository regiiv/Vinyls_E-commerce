package com.mindHub.vinilysEcommerce.repositories;

import com.mindHub.vinilysEcommerce.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

    public Client findByEmail(String email);

    public Client findById (long id);

}
