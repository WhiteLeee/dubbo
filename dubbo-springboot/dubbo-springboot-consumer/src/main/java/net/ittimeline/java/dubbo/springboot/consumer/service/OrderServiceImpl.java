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
     */
    @Reference(check = false,retries = 3) //check=false即可以关闭启动时检查 ,retries=3 超时后重试3次，如果超时的服务部署了多个，会轮训调用
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        List<UserAddress> userAddressList =
                userService.getUserAddressList(userId);

      return userAddressList;
    }
}
