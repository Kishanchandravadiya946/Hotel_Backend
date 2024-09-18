package com.hotel.dao;

import com.hotel.entity.Employee;
import com.hotel.entity.Guest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GuestDAOImpl implements GuestDAO {
    private EntityManager entityManager ;

    
    @Autowired
    GuestDAOImpl(EntityManager entityManager){
    	this.entityManager =entityManager;
    }
    @Override
    public List<Guest> getAllGuests() {
    	String sql = "From Guest ";
    	TypedQuery<Guest> q = entityManager.createQuery(sql,Guest.class);
//    	List<String> employeeName = new ArrayList<>();
    	
//        List<Object[]> emp = q.getResultList();
    	return q.getResultList();
    }

    @Override
    public Guest getGuestById(int id) {
       return entityManager.find(Guest.class,id);
    }

    @Override
    public void addGuest(Guest guest) {
    	
       entityManager.persist(guest);
    }

    @Override
    public void updateGuest(int id, Guest theguest) {
    	  Guest guest = entityManager.find(Guest.class, id);
          String email = theguest.getEmail();
          String name = theguest.getName();
          String address = theguest.getAddres();
          if(email != null) {
          	guest.setEmail(email);
          }
          if(name != null) {
        	  guest.setName(name);
          }
          if(address != null) {
        	  guest.setAddres(address);
          }
          entityManager.merge(guest);
    }

    @Override
    public void deleteGuest(int id) {
       Guest guest=entityManager.find(Guest.class,id);
       entityManager.remove(guest);
    }
}
