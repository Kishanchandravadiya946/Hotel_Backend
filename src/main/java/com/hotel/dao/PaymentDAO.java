package com.hotel.dao;

import com.hotel.entity.Payment;
import java.util.List;

public interface PaymentDAO {
    // Method to retrieve all payments
    List<Payment> getAllPayments();

    // Method to retrieve a payment by ID
    Payment getPaymentById(int id);

    // Method to add a new payment
    void addPayment(Payment payment);

    // Method to update an existing payment
    void updatePayment(int id, Payment payment);

    // Method to delete a payment by ID
    void deletePayment(int id);
}
