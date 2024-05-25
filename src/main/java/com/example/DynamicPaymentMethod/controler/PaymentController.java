package com.example.DynamicPaymentMethod.controler;

import com.example.DynamicPaymentMethod.service.PaymentService;
import com.example.DynamicPaymentMethod.service.PaymentServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentServiceFactory paymentServiceFactory;

    @Autowired
    public PaymentController(PaymentServiceFactory paymentServiceFactory) {
        this.paymentServiceFactory = paymentServiceFactory;
    }

    @PostMapping("/payments")
    public ResponseEntity<String> executePayment(@RequestParam String paymentMethod, @RequestParam double amount) {
        PaymentService paymentService = paymentServiceFactory.createPaymentService(paymentMethod);
        paymentService.pay(amount);
        return ResponseEntity.ok("Payment executed successfully");
    }
}
