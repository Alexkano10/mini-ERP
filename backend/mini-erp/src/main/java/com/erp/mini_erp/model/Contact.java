package com.erp.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String position;
    private String phone;
    private String email;

    // Relación Many-to-One con Company, ya que cada contacto pertenece a una compañía
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

}