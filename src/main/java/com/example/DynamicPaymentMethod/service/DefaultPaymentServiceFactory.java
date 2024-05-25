package com.example.DynamicPaymentMethod.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultPaymentServiceFactory implements PaymentServiceFactory {

    @Override
    public PaymentService createPaymentService(String paymentMethod) {
        if ("creditcard".equals(paymentMethod)) {
            return new CreditCardPaymentService();
        } else if ("paypal".equals(paymentMethod)) {
            return new PayPalPaymentService();
        }
        throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
    }
}
