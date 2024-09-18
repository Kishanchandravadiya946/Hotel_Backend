package com.hotel.service;

import java.util.List;

import com.hotel.entity.Room;

public interface RoomService {
    // Method to retrieve all rooms
    List<Room> getAllRooms();

    // Method to retrieve a room by ID
    Room getRoomById(int id);

    // Method to add a new room
    void addRoom(Room room);

    
    // Method to delete a room by ID
    void deleteRoom(int id);
}
