package com.myname.onlinebankingservice.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String username;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    private BankAccount bankAccount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Phone> phones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Email> emails;
}
