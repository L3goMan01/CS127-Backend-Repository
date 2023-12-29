package com.example.mp127.service;

import com.example.mp127.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee employeeLogin(String username);
    Employee updateEmployeeSalary(Long id, Float salary);
    Employee updateEmployee(Long id, Employee updateData);
}
