package com.erp.mini_erp.repository;

import com.erp.mini_erp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}