package com.example.ecommerce.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String number;

    private String district;

    private String city;

    private String state;

    private String zipCode;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
