package com.hotel.service;

import java.util.List;

import com.hotel.entity.Hotel;

public interface HotelService {
    // Method to retrieve all hotels
    List<Hotel> getAllHotels();

    // Method to retrieve a hotel by ID
    Hotel getHotelById(int id);

    // Method to add a new hotel
    void addHotel(Hotel hotel);

    // Method to update an existing hotel
    void updateHotel(int id, Hotel hotel);

    // Method to delete a hotel by ID
    void deleteHotel(int id);
}

