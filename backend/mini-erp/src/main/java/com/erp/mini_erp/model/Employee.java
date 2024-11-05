package com.erp.mini_erp.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true) // Incluirá el toString de Person
@Entity
public class Employee extends Person {

    private String position;
    private Double salary;
    private Date hireDate;
    private Boolean active;

}