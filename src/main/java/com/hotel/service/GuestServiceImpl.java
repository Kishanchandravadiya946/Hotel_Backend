package com.hotel.service;

import com.hotel.dao.GuestDAO;
import com.hotel.entity.Guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class GuestServiceImpl implements GuestService {
    private  GuestDAO guestDAO;
    @Autowired
    public GuestServiceImpl(GuestDAO guestDAO) {
        this.guestDAO = guestDAO;
    }

    @Override
    @Transactional
    public List<Guest> getAllGuests() {
        return guestDAO.getAllGuests();
    }

    @Override
    @Transactional
    public Guest getGuestById(int id) {
        return guestDAO.getGuestById(id);
    }

    @Override
    @Transactional
    public void addGuest(Guest guest) {
        guestDAO.addGuest(guest);
    }

    @Override
    @Transactional
    public void updateGuest(int id, Guest guest) {
        guestDAO.updateGuest(id, guest);
    }

    @Override
    @Transactional
    public void deleteGuest(int id) {
        guestDAO.deleteGuest(id);
    }
}

