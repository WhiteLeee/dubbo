package net.ittimeline.java.dubbo.springboot.consumer.controller;

import net.ittimeline.java.dubbo.springboot.model.UserAddress;
import net.ittimeline.java.dubbo.springboot.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * OrderController
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 13:58
 * @website www.ittimeline.net
 * @since JDK8u192
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @GetMapping("/init")
    public List<UserAddress> initOrder(@RequestParam("userId")String userId){

     List<UserAddress> userAddressList=   orderService.initOrder(userId);

     return userAddressList;
    }
}
