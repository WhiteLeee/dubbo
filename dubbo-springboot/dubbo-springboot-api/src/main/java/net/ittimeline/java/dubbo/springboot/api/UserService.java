package net.ittimeline.java.dubbo.springboot.api;

import net.ittimeline.java.dubbo.springboot.model.UserAddress;

import java.util.List;

/**
 * UserService
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-15 13:53
 * @website www.ittimeline.net
 * @since JDK8u192
 */
public interface UserService {

    /**
     * 根据用户ID获取所有的收获地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
