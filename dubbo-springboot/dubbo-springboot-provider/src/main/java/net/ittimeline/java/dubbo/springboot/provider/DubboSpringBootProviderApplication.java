package net.ittimeline.java.dubbo.springboot.provider;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 14:02
 * @website www.ittimeline.net
 * @since JDK8u192
 */
@SpringBootApplication
@EnableDubbo
public class DubboSpringBootProviderApplication {


    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootProviderApplication.class);
    }
}
