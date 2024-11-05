package com.erp.mini_erp.repository;

import com.erp.mini_erp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}