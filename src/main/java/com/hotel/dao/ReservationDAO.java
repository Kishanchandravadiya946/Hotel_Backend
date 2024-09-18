package com.hotel.dao;


import com.hotel.entity.Reservation;
import java.util.List;

public interface ReservationDAO {
    List<Reservation> getAllReservations();

    void addReservation(Reservation reservation);
    
    void deleteReservation(int id);
}
