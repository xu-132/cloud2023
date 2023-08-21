package com.mylearn.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 负载均衡算法接口
 * @author xu
 * @date 2023/8/7
 */
public interface LoadBalancer {
    /**
     * 从服务列表中用负载均衡算法选择出具体的实例
     * @param serviceInstances 服务列表
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
