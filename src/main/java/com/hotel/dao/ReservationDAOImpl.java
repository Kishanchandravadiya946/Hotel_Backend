package com.hotel.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotel.entity.Guest;
import com.hotel.entity.Hotel;
import com.hotel.entity.Reservation;
import com.hotel.entity.Room;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class ReservationDAOImpl implements ReservationDAO {
	
	private EntityManager entityManager;
	@Autowired
	ReservationDAOImpl(EntityManager entityManager){
    	this.entityManager =entityManager;
    }

	@Override
	public List<Reservation> getAllReservations() {
		String sql = "From Reservation ";
    	TypedQuery<Reservation> q = entityManager.createQuery(sql,Reservation.class);
//    	List<String> employeeName = new ArrayList<>();
    	
//        List<Object[]> emp = q.getResultList();
    	return q.getResultList();
	}

	@Override
	public void deleteReservation(int id) {
		// TODO Auto-generated method stub
		Reservation reservation=entityManager.find(Reservation.class, id);
		entityManager.remove(reservation);
		
	}

	@Override
	public void addReservation(Reservation reservation) {
		
		
    	
		System.out.print(reservation);
		// TODO Auto-generated method stub
		Guest guest=entityManager.find(Guest.class,reservation.getGuest().getId());
		reservation.setGuest(guest);
//		
		Hotel hotel=entityManager.find(Hotel.class, reservation.getHotel().getId());
		reservation.setHotel(hotel);
//		
		Room room=entityManager.find(Room.class, reservation.getRoom().getId());
		reservation.setRoom(room);
//		
//		System.out.print(reservation);

//		Object reseravtion;
		entityManager.persist(reservation);
	}

}
