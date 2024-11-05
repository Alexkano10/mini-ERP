package com.erp.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String businessName;
    private String tradeName;
    private String taxId;
    private String fiscalAddress;
    private String phone;
    private String email;
    private Boolean active;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL) // Relación con Contact
    private List<Contact> contacts;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL) // Relación con ProvidedService
    private List<ProvidedService> providedServices;
}