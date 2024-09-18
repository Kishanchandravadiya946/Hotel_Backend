package com.hotel.service;

import java.util.List;

import com.hotel.entity.Reservation;

public interface ReservationService {
    List<Reservation> getAllReservations();

    void addReservation(Reservation reservation);

    void deleteReservation(int id);
}

