package net.ittimeline.java.dubbo.springboot.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import net.ittimeline.java.dubbo.springboot.api.UserService;
import net.ittimeline.java.dubbo.springboot.model.UserAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    /**
     * 通过@Reference注解远程调用UserService服务
     * check=false即可以关闭启动时检查
     * retries=3 超时后重试3次，如果超时的服务部署了多个，会轮询调用
     * version=1.0.0 这里指定调用user service的版本是1.0.0，如果不想区分版本，随机调用服务提供方的任意版本，可以使用*匹配
     * stub="net.ittimeline.java.dubbo.springboot.api.stub.UserServiceStub" 会首先执行UserServiceStub实现类的getUserAddressList方法
     */
    @Reference(check = false,retries = 3,version = "1.0.0",stub = "net.ittimeline.java.dubbo.springboot.api.stub.UserServiceStub")
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        List<UserAddress> userAddressList =
                userService.getUserAddressList(userId);

      return userAddressList;
    }
}
