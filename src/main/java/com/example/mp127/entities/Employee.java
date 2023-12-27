package com.example.mp127.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Entity(name="EMPLOYEE")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(generator = "employee_seq_gen")
    @SequenceGenerator(name = "employee_seq_gen", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
    private Long employeeId;

    private Long employeeTypeId;

    private String username;

    private String password;

    private String firstName;

    private String middleName;

    private String lastName;

    private Float salary;

    private Long supervisorId;
}
