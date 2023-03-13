package com.example.TaskSimbirSoft.DAO;

import com.example.TaskSimbirSoft.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientByName(String name);
    Optional<Client> findByEmail(String email);
}
