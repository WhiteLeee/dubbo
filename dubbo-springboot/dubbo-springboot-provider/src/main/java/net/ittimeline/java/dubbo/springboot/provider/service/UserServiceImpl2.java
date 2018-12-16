package net.ittimeline.java.dubbo.springboot.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import net.ittimeline.java.dubbo.springboot.api.UserService;
import net.ittimeline.java.dubbo.springboot.model.UserAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * UserServiceImpl2
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 20:13
 * @website www.ittimeline.net
 * @since JDK8u192
 */
@Component
@Service(version ="2.0.0")
public class UserServiceImpl2 implements UserService {
    private static final Logger LOGGER= LogManager.getLogger();


    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        LOGGER.info("invoke user service impl2 get user address list method");

        List<UserAddress> userAddressList =new ArrayList<>();

        UserAddress xiaoshitou=new UserAddress();

        xiaoshitou.setId(1L);
        xiaoshitou.setUserAddress("深圳市福田区");
        xiaoshitou.setConsignee("小石头");
        xiaoshitou.setIsDefault("0");


        UserAddress tony =new UserAddress();
        tony.setUserAddress("深圳市龙岗区");
        tony.setConsignee("tony");
        tony.setIsDefault("1");

        userAddressList.add(xiaoshitou);
        userAddressList.add(tony);




        return userAddressList;
    }
}
