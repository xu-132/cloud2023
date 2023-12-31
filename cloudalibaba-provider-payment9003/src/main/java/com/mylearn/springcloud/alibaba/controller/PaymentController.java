package com.mylearn.springcloud.alibaba.controller;

import com.mylearn.springcloud.entities.CommonResult;
import com.mylearn.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author xu
 * @date 2023/8/16
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"12345681"));
        hashMap.put(2L,new Payment(2L,"12345682"));
        hashMap.put(3L,new Payment(3L,"12345683"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200,"from mysql,serverPort: "+serverPort,payment);
        return result;
    }
}
