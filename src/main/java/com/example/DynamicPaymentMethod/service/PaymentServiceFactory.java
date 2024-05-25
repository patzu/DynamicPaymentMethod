package com.example.DynamicPaymentMethod.service;

public interface PaymentServiceFactory {
    PaymentService createPaymentService(String paymentMethod);
}
