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

    private Long employeetypeId;

    private String username;

    private String password;

    private String firstName;

    private String middleName;

    private String lastName;

    private Float salary;

    private Long supervisorId;

    public Employee(
            Long employeeId, Long employeetypeId, String username, String password,
            String firstName, String middleName, String lastName, Float salary, Long supervisorId
    ) {
        this.employeeId = employeeId;
        this.employeetypeId = employeetypeId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.supervisorId = supervisorId;
    }
}
