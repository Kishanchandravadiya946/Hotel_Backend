package com.hotel.dao;

import com.hotel.entity.Guest;
import java.util.List;

public interface GuestDAO {
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

