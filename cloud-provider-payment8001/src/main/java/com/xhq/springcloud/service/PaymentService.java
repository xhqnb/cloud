package com.xhq.springcloud.service;

import com.xhq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Integer id);
}
