package com.hotel.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hotel.entity.Employee;
import com.hotel.entity.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
    private  EntityManager entityManager;
    
    @Autowired
    EmployeeDAOImpl(EntityManager entityManager){
    	this.entityManager =entityManager;
    }
    @Override
    public List<Employee> getAllEmployees() {
    	String sql = "From Employee ";
    	TypedQuery<Employee> q = entityManager.createQuery(sql,Employee.class);
//    	List<String> employeeName = new ArrayList<>();
    	
//        List<Object[]> emp = q.getResultList();
    	return q.getResultList();
    }

    @Override
  
    public Employee getEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
      
    }

    @Override
    public void addEmployee(Employee employee) {
//    	System.out.print(employee);
    	Hotel hotel=entityManager.find(Hotel.class, employee.getHotelId().getId());
    	employee.setHotelId(hotel);
         entityManager.persist(employee);
       
    }

    @Override
    public void updateEmployee(int id , Employee theemployee) {
        Employee employee = entityManager.find(Employee.class, id);
        String email = theemployee.getEmail();
        String name = theemployee.getName();
        String role = theemployee.getRole();
        if(email != null) {
        	employee.setEmail(email);
        }
        if(name != null) {
        	employee.setName(name);
        }
        if(role != null) {
        	employee.setRole(role);
        }
        entityManager.merge(employee);
        
        
    }

    @Override
    public void deleteEmployee(int id) {
    	 Employee employee = entityManager.find(Employee.class, id);
    	 entityManager.remove(employee);
    	 
    }
}
