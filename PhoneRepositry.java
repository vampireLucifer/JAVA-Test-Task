package com.myname.onlinebankingservice.repository;

import com.myname.onlinebankingservice.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
