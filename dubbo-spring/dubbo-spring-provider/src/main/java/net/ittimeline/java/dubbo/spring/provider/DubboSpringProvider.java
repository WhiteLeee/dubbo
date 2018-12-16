package net.ittimeline.java.dubbo.spring.provider;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DubboSpringProvider
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 11:48
 * @website www.ittimeline.net
 * @since JDK8u192
 */

public class DubboSpringProvider {


    private static final Logger LOGGER= LogManager.getLogger();

    public static void main(String[] args) throws Exception{

        //实例化IOC容器
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("dubbo-spring-provider.xml");
        //启动容器
        applicationContext.start();
        LOGGER.info("dubbo-spring-provider启动成功");

        //阻塞
        System.in.read();





    }
}
