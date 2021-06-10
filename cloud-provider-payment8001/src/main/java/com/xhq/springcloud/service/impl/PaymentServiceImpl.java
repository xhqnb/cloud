package com.xhq.springcloud.service.impl;


import com.xhq.springcloud.dao.PaymentDao;
import com.xhq.springcloud.entities.Payment;
import com.xhq.springcloud.service.PaymentService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
