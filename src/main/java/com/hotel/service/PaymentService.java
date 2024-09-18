package com.hotel.service;

import java.util.List;

import com.hotel.entity.Payment;

public interface PaymentService {
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

