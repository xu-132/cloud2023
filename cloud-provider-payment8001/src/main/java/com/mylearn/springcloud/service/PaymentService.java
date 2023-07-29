package com.mylearn.springcloud.service;

import com.mylearn.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author xu
 * @date 2023/7/28
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
