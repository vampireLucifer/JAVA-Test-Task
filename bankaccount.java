package com.myname.onlinebankingservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal balance;
    private BigDecimal initialBalance;
    @OneToOne(mappedBy = "bankAccount")
    private Client client;
}
