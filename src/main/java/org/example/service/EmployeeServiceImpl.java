package org.example.service;

import org.example.entities.Employee;
import org.example.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(employee.getId());

        if (existingEmployee.isPresent()){
                employeeRepository.save(employee);
        }
    }

    @Override
    public void delete(Employee employee) {

        employeeRepository.delete(employee);
    }
}
