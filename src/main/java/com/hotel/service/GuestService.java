package com.hotel.service;

import java.util.List;

import com.hotel.entity.Guest;

public interface GuestService {
    // Method to retrieve all guests
    List<Guest> getAllGuests();

    // Method to retrieve a guest by ID
    Guest getGuestById(int id);

    // Method to add a new guest
    void addGuest(Guest guest);

    // Method to update an existing guest
    void updateGuest(int id, Guest guest);

    // Method to delete a guest by ID
    void deleteGuest(int id);
}

