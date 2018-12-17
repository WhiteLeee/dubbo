package net.ittimeline.java.dubbo.springboot.api.stub;

import net.ittimeline.java.dubbo.springboot.api.UserService;
import net.ittimeline.java.dubbo.springboot.model.UserAddress;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 本地存根
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 20:36
 * @website www.ittimeline.net
 * @since JDK8u192
 */
public class UserServiceStub implements UserService {


    private static final Logger LOGGER= LogManager.getLogger();


    private final UserService userService;

    /**
     * 构造函数传入真正的远程代理对象
     * @param userService 其远程代理对象
     */
    public UserServiceStub(UserService userService){
        this.userService=userService;
    }


    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        LOGGER.info("此代码在客户端执行，你可以在客户端做ThreadLocal本地缓存，或者预先验证参数是否合法等等");
        //参数校验
        if(StringUtils.isNotEmpty(userId)){
            return userService.getUserAddressList(userId);
        }

        return new ArrayList<>();
    }
}
