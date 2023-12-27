package com.example.mp127.controller;

import com.example.mp127.entities.Employee;
import com.example.mp127.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employee")
public class EmployeeController {
     private final EmployeeService employeeService;

     @GetMapping(path="/all")
     public List<Employee> getAllEmployees() {
         return employeeService.getAllEmployees();
     }
}
