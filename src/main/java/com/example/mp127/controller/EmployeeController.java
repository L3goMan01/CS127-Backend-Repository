package com.example.mp127.controller;

import com.example.mp127.entities.Employee;
import com.example.mp127.entities.request.AddEmployeeRequest;
import com.example.mp127.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employee")
public class EmployeeController {
     private final EmployeeService employeeService;

     @GetMapping(path = "/all")
     public List<Employee> getAllEmployees() {
         return employeeService.getAllEmployees();
     }

     @GetMapping(path = "/login/{username}")
     public Employee employeeLogin(@PathVariable String username) {
         System.out.println(username);
         System.out.println(employeeService.employeeLogin(username).getPassword());
         return employeeService.employeeLogin(username);
     }

    @PutMapping(path = "/edit/salary/{Id}/{Salary}")
    public Employee updateEmployeeSalary(@PathVariable Long Id, @PathVariable Float Salary) {
         return employeeService.updateEmployeeSalary(Id,Salary);
    }

    @PutMapping(path = "/edit/{Id}")
    public Employee updateEmployee(@PathVariable Long Id, @RequestBody AddEmployeeRequest update) {
         Employee updateData = update.mapToEmployee();
         return employeeService.updateEmployee(Id, updateData);
    }
}
