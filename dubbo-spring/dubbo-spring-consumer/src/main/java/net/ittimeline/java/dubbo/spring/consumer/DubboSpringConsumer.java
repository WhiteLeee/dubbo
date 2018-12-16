package net.ittimeline.java.dubbo.spring.consumer;

import net.ittimeline.java.dubbo.spring.common.spring.SpringContextLoader;
import net.ittimeline.java.dubbo.spring.consumer.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DubooSpringConsumer
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 12:01
 * @website www.ittimeline.net
 * @since JDK8u192
 */
public class DubboSpringConsumer {


    public static void main(String[] args) throws Exception{

        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("dubbo-spring-consumer.xml");

        applicationContext.start();


       OrderService orderService= SpringContextLoader.getBean(OrderService.class);

       String userId="10000";
       orderService.initOrder(userId);

       System.in.read();
    }
}
