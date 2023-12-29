package com.example.mp127.entities.request;

import com.example.mp127.entities.Employee;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddEmployeeRequest {
    @JsonProperty("employeeId")
    private Long employeeId;

    @JsonProperty("employeetypeId")
    private Long employeetypeId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("salary")
    private Float salary;

    @JsonProperty("supervisorId")
    private Long supervisorId;

    public Employee mapToEmployee() {
        return new Employee(
                employeeId,employeetypeId,username,password,firstName,middleName,lastName,salary,supervisorId
        );
    }
}
