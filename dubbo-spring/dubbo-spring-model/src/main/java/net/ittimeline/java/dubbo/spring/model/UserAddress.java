package net.ittimeline.java.dubbo.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户地址
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-15 13:48
 * @website www.ittimeline.net
 * @since JDK8u192
 */


public class UserAddress implements Serializable {

    /**
     * 用户编号
     */
    private Long id;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 收货人
     */
    private String consignee;


    /**
     * 是否为默认地址
     */
    private String isDefault;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }


    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("id", id)
                .append("userAddress", userAddress)
                .append("consignee", consignee)
                .append("isDefault", isDefault)
                .toString();
    }
}
