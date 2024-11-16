package com.ayush.ems_backend.repository;

import com.ayush.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    // it uses JPA for CRUD operations annotated with Repository and
    // Transational

}
