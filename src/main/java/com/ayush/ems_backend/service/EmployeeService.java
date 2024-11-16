package com.ayush.ems_backend.service;

import com.ayush.ems_backend.dto.EmployeeDto;
import com.ayush.ems_backend.entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

}
