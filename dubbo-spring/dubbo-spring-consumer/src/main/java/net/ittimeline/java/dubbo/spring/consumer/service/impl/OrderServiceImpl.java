package net.ittimeline.java.dubbo.spring.consumer.service.impl;

import net.ittimeline.java.dubbo.spring.api.service.UserService;
import net.ittimeline.java.dubbo.spring.consumer.service.OrderService;
import net.ittimeline.java.dubbo.spring.model.UserAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 10:18
 * @website www.ittimeline.net
 * @since JDK8u192
 */
@Service
public class OrderServiceImpl implements OrderService {

    private static final Logger LOGGER= LogManager.getLogger();

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(String userId) {

        List<UserAddress> userAddressList =
                userService.getUserAddressList(userId);

        LOGGER.info("dubbo-spring-consumer远程调用dubbo-spring-provider模块的user service 根据用户ID获取地址列表 {}",userAddressList);


    }
}
