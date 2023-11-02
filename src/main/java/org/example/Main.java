package org.example;

import org.example.entities.Department;
import org.example.entities.Employee;
import org.example.service.EmployeeService;
import org.example.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

        EmployeeService employeeService = appContext.getBean("employeeService", EmployeeServiceImpl.class);

        Employee employee = new Employee();
        employee.setName("John");
        employee.setSalary(50000.0);
//        employee.setDepartment();

        employeeService.create(employee);
        System.out.println(employeeService.findAll());
    }
}