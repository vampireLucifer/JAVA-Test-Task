package com.myname.onlinebankingservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    @ManyToOne
    private Client client;
}
