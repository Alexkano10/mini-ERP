package com.erp.mini_erp.repository;

import com.erp.mini_erp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}