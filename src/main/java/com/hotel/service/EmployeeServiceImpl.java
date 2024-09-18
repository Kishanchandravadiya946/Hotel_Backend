package com.hotel.service;

import com.hotel.dao.EmployeeDAO;
import com.hotel.entity.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private  EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(int id, Employee employee) {
        Employee existingEmployee = employeeDAO.getEmployeeById(id);
        if (existingEmployee != null) {
            // Set the ID of the employee to be updated
//            employee.setID(id);
            employeeDAO.updateEmployee(id,employee);
        } else {
            // Employee with the given ID not found
            throw new IllegalArgumentException("Employee with ID " + id + " not found");
        }
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
