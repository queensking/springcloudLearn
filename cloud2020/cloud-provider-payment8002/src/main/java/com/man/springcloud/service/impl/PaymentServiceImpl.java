package com.man.springcloud.service.impl;

import com.man.springcloud.dao.PaymentDao;
import com.man.springcloud.entities.Payment;
import com.man.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
       return paymentDao.getPaymentById(id);

    }
}
