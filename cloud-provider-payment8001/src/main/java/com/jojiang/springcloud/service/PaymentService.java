package com.jojiang.springcloud.service;

import com.jojiang.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
