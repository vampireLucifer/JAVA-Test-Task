package com.myname.onlinebankingservice.repository;

import com.myname.onlinebankingservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
