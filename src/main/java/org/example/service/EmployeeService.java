package org.example.service;

import org.example.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService  {
    List<Employee> findAll();

    Optional<Employee> findById(Long id);
    Employee create(Employee employee);

}
