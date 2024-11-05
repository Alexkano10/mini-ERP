package com.erp.mini_erp.repository;

import com.erp.mini_erp.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}