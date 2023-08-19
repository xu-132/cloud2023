package com.mylearn.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author xu
 * @date 2023/8/18
 */
@Mapper
public interface AccountDao {

    //扣减账户余额
    void decrease(@Param("userId") Long userId,@Param("money") BigDecimal money);
}
