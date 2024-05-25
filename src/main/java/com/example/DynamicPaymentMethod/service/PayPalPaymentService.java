package com.example.DynamicPaymentMethod.service;

import org.springframework.stereotype.Component;

// PayPalPaymentService.java
@Component
public class PayPalPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with PayPal");
    }
}