package com.hotel.dao;

import com.hotel.entity.Guest;
import com.hotel.entity.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HotelDAOImpl implements HotelDAO {
    private  EntityManager entityManager ;
    
    @Autowired
    HotelDAOImpl(EntityManager entityManager){
    	this.entityManager =entityManager;
    }
    @Override
    public List<Hotel> getAllHotels() {
    	String sql = "From Hotel ";
    	TypedQuery<Hotel> q = entityManager.createQuery(sql,Hotel.class);
//    	List<String> employeeName = new ArrayList<>();
    	
//        List<Object[]> emp = q.getResultList();
    	return q.getResultList();    }

    @Override
    public Hotel getHotelById(int id) {
        return entityManager.find(Hotel.class, id);
    }

    @Override
    public void addHotel(Hotel hotel) {
            entityManager.persist(hotel);
           
    }

    @Override
    public void updateHotel(int id, Hotel thehotel) {
        Hotel hotel=entityManager.find(Hotel.class,id);
        String name=thehotel.getName();
        String  email=thehotel.getEmail();
        String addres=thehotel.getAddress();
        int rating=thehotel.getRating();
        
        if(name!=null)
        	hotel.setName(name);
        if(email!=null)
        	hotel.setEmail(email);
        if(addres!=null)
        	hotel.setAddress(addres);
        entityManager.merge(hotel);

    }

    @Override
    public void deleteHotel(int id) {
        Hotel hotel=entityManager.find(Hotel.class,id);
        entityManager.remove(hotel);
    }
}
