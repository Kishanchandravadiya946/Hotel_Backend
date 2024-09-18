package com.hotel.service;
import java.util.List;

import com.hotel.entity.Employee;

public interface EmployeeService{
    // Method to retrieve all employees
    List<Employee> getAllEmployees();

    // Method to retrieve an employee by ID
    Employee getEmployeeById(int id);

    // Method to add a new employee
    void addEmployee(Employee employee);

    // Method to update an existing employee
    void updateEmployee(int id , Employee employee);

    // Method to delete an employee by ID
    void deleteEmployee(int id);
}

