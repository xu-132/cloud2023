package com.mylearn.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.mylearn.springcloud.entities.CommonResult;
import com.mylearn.springcloud.entities.Payment;

/**
 * @author xu
 * @date 2023/8/16
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException----2");
    }
}
