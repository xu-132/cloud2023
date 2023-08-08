package com.mylearn.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xu
 * @date 2023/8/8
 */
@Service
public class PaymentService {

    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_OK,id: " + id +"\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * 模拟会出错的方法，此处用超时模拟
     * @param id
     * @return
     */
    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_Timeout,id: " + id +"\t" + "O(∩_∩)O哈哈~" + "耗时(秒): " + timeNumber;
    }
}
