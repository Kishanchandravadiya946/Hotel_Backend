package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.dao.PaymentDAO;
import com.hotel.entity.Payment;
@Service
public class PaymentServiceImpl implements PaymentService {
    private  PaymentDAO paymentDAO;
    @Autowired
    public PaymentServiceImpl(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    @Override
    @Transactional
    public List<Payment> getAllPayments() {
        return paymentDAO.getAllPayments();
    }

    @Override
    @Transactional
    public Payment getPaymentById(int id) {
        return paymentDAO.getPaymentById(id);
    }

    @Override
    @Transactional
    public void addPayment(Payment payment) {
        paymentDAO.addPayment(payment);
    }

    @Override
    @Transactional
    public void updatePayment(int id, Payment payment) {
        paymentDAO.updatePayment(id, payment);
    }

    @Override
    @Transactional
    public void deletePayment(int id) {
        paymentDAO.deletePayment(id);
    }
}
