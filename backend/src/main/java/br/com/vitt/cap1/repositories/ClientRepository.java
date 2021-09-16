package br.com.vitt.cap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vitt.cap1.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
