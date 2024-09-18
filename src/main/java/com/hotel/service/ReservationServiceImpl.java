package com.hotel.service;

import com.hotel.dao.ReservationDAO;
import com.hotel.entity.Reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationDAO reservationDAO;
    @Autowired
    public ReservationServiceImpl(ReservationDAO reservationDAO) {
        this.reservationDAO = reservationDAO;
    }

    @Override
    @Transactional
    public List<Reservation> getAllReservations() {
        return reservationDAO.getAllReservations();
    }

    @Override
    @Transactional
    public void deleteReservation(int id) {
        reservationDAO.deleteReservation(id);
    }

	@Override
	@Transactional
	public void addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationDAO.addReservation(reservation);
	}
}
