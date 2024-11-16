package com.ayush.ems_backend.service.impl;

import com.ayush.ems_backend.dto.EmployeeDto;
import com.ayush.ems_backend.entity.Employee;
import com.ayush.ems_backend.exception.ResourceNotFoundException;
import com.ayush.ems_backend.mapper.EmployeeMapper;
import com.ayush.ems_backend.repository.EmployeeRepository;
import com.ayush.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeDto savedemployeeDto =
                EmployeeMapper.mapToEmployeeDto(savedEmployee);
        return savedemployeeDto;

    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()-> new  ResourceNotFoundException("Employee " +
                        "Doesnt " +
                        "exist with the given ID : "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
