package net.ittimeline.java.dubbo.springboot.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DubboSpringBootConsumerApplication
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 14:01
 * @website www.ittimeline.net
 * @since JDK8u192
 */
@SpringBootApplication
@EnableDubbo
public class DubboSpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootConsumerApplication.class);
    }
}
