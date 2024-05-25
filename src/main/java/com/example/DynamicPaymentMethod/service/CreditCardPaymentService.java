package com.example.DynamicPaymentMethod.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// CreditCardPaymentService.java
@Component
@Primary
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with Credit Card");
    }
}
