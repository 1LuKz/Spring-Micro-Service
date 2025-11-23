package com.springmicroservice.hr_payroll.services;

import com.springmicroservice.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Integer workerId, int days){
        return new Payment("Test", 200.0, days);
    }
}
