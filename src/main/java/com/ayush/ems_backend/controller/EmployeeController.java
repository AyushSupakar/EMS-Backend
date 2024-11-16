package com.ayush.ems_backend.controller;

import com.ayush.ems_backend.dto.EmployeeDto;
import com.ayush.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController{
    private EmployeeService employeeService;

    //Build Add Employee REST API.
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee,
                HttpStatus.CREATED);
    }

    //Build Get Employee REST API.
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long employeeId){
        EmployeeDto employee = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employee);
    }

    //Build Get all Employees
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> allemployees = employeeService.getAllEmployee();
        return ResponseEntity.ok(allemployees);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody EmployeeDto updatedEmployeeDtoS){
        EmployeeDto updatedEmployeeDtoR =
                employeeService.updateEmployee(employeeId,
                        updatedEmployeeDtoS);
        return ResponseEntity.ok(updatedEmployeeDtoR);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
        return ResponseEntity.ok("Employee Deleted Successfully");
    }


}
