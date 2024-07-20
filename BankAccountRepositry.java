package com.myname.onlinebankingservice.repository;

import com.myname.onlinebankingservice.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
