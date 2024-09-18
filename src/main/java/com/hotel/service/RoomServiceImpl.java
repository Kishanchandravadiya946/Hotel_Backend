package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.dao.RoomDAO;
import com.hotel.entity.Room;
@Service
public class RoomServiceImpl implements RoomService {
    private final RoomDAO roomDAO;
    @Autowired
    public RoomServiceImpl(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @Override
    @Transactional
    public List<Room> getAllRooms() {
        return roomDAO.getAllRooms();
    }

    @Override
    @Transactional
    public Room getRoomById(int id) {
        return roomDAO.getRoomById(id);
    }

    @Override
    @Transactional
    public void addRoom(Room room) {
        roomDAO.addRoom(room);
    }

    @Override
    @Transactional
    public void deleteRoom(int id) {
        roomDAO.deleteRoom(id);
    }
}

