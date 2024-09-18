package com.hotel.dao;

import com.hotel.entity.Hotel;
import com.hotel.entity.Room;

import jakarta.persistence.EntityManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomDAOImpl implements RoomDAO {
    private  EntityManager entityManager ;
    
    @Autowired
   RoomDAOImpl(EntityManager entityManager){
    	this.entityManager =entityManager;
    }
    @Override
    public List<Room> getAllRooms() {
        return entityManager.createQuery("SELECT r FROM Room r", Room.class).getResultList();
    }

    @Override
    public Room getRoomById(int id) {
        return entityManager.find(Room.class, id);
    }

    @Override
    public void addRoom(Room room) {
    	System.out.print(room);
     	Hotel hotel=entityManager.find(Hotel.class, room.getHotel().getId());
    	room.setHotel(hotel);
       entityManager.persist(room);
    }

    @Override
    public void deleteRoom(int id) {
       Room room=entityManager.find(Room.class,id);
       entityManager.remove(room);
    }
}
