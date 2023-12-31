package com.mylearn.springcloud.alibaba.service;

import com.mylearn.springcloud.entities.CommonResult;
import com.mylearn.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author xu
 * @date 2023/8/17
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
