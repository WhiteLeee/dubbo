package net.ittimeline.java.dubbo.springboot.consumer.service;


import net.ittimeline.java.dubbo.springboot.model.UserAddress;

import java.util.List;

/**
 * OrderService
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 13:11
 * @website www.ittimeline.net
 * @since JDK8u192
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    List<UserAddress> initOrder(String userId);

}
