package com.ayush.ems_backend.mapper;

import com.ayush.ems_backend.dto.EmployeeDto;
import com.ayush.ems_backend.entity.Employee;

public class EmployeeMapper {
    // To transfer data b/n client and server : convert from entity to -dto.

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getFirstName(),
                employee.getFirstName(),
                );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getFirstName(),
                employeeDto.getFirstName(),
                );
    }



}
