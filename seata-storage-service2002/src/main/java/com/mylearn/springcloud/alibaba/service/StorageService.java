package com.mylearn.springcloud.alibaba.service;

/**
 * @author xu
 * @date 2023/8/18
 */
public interface StorageService {
    //扣减库存
    void decrease(Long productId,Integer count);
}
