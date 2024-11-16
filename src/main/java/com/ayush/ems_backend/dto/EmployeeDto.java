package com.ayush.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    //Dto= Data Transfer Object : just like JSON

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
