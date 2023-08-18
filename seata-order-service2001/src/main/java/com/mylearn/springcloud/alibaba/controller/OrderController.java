package com.mylearn.springcloud.alibaba.controller;

import com.mylearn.springcloud.alibaba.domain.CommonResult;
import com.mylearn.springcloud.alibaba.domain.Order;
import com.mylearn.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xu
 * @date 2023/8/18
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create") //这里用Get，是因为Controller层，这里是用户下订单访问的，只能是Get
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
