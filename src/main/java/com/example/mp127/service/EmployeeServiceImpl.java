package com.example.mp127.service;

import com.example.mp127.entities.Employee;
import com.example.mp127.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee employeeLogin(String username) {
        return employeeRepository.findByusername(username);
    }

    @Override
    public Employee updateEmployeeSalary(Long id, Float salary) {
        Employee employeeToUpdate = employeeRepository.findByemployeeId(id);

        employeeToUpdate.setSalary(salary);

        return employeeRepository.save(employeeToUpdate);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updateData) {
        Employee employeeToUpdate = employeeRepository.findByemployeeId(id);

        if (updateData.getEmployeetypeId() != null) {
            employeeToUpdate.setEmployeetypeId(updateData.getEmployeetypeId());
        }
        if (updateData.getUsername() != null) {
            employeeToUpdate.setUsername(updateData.getUsername());
        }
        if (updateData.getPassword() != null) {
            employeeToUpdate.setPassword(updateData.getPassword());
        }
        if (updateData.getFirstName() != null) {
            employeeToUpdate.setFirstName(updateData.getFirstName());
        }
        if (updateData.getMiddleName() != null) {
            employeeToUpdate.setMiddleName(updateData.getMiddleName());
        }
        if (updateData.getLastName() != null) {
            employeeToUpdate.setLastName(updateData.getLastName());
        }
        if (updateData.getSalary() != null) {
            employeeToUpdate.setSalary(updateData.getSalary());
        }
        if (updateData.getSupervisorId() != null) {
            employeeToUpdate.setSupervisorId(updateData.getSupervisorId());
        }

        return employeeRepository.save(employeeToUpdate);
    }
}
