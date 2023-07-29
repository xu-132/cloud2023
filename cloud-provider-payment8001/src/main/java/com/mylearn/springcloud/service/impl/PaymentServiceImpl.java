package com.mylearn.springcloud.service.impl;

import com.mylearn.springcloud.dao.PaymentDao;
import com.mylearn.springcloud.entities.Payment;
import com.mylearn.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xu
 * @date 2023/7/28
 */
@Service
public class PaymentServiceImpl implements PaymentService {
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
