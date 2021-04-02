package com.man.springcloud.service;

import com.man.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface IPaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
