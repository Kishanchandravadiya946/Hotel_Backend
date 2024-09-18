package com.hotel.dao;

import com.hotel.entity.Hotel;
import com.hotel.entity.Payment;
import com.hotel.entity.Reservation;

import jakarta.persistence.EntityManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class PaymentDAOImpl implements PaymentDAO {
    private  EntityManager entityManager ;
    @Autowired
    PaymentDAOImpl(EntityManager entityManager){
    	this.entityManager =entityManager;
    }

    @Override
    public List<Payment> getAllPayments() {
        return entityManager.createQuery("SELECT p FROM Payment p", Payment.class).getResultList();
    }

    @Override
    public Payment getPaymentById(int id) {
        return entityManager.find(Payment.class, id);
    }

    @Override
    public void addPayment(Payment payment) {
        Reservation reservation=entityManager.find(Reservation.class, payment.getReservation().getId());
        payment.setReservation(reservation);
            entityManager.persist(payment);
           
    }

    @Override
    public void updatePayment(int id, Payment thepayment) {
    	Payment payment=entityManager.find(Payment.class, id);
    	payment.setAmount(thepayment.getAmount());
    	entityManager.merge(payment);
    
    }


	@Override
	public void deletePayment(int id) {
		// TODO Auto-generated method stub
    	Payment payment=entityManager.find(Payment.class, id);
    	entityManager.remove(payment);
	}

		
	}