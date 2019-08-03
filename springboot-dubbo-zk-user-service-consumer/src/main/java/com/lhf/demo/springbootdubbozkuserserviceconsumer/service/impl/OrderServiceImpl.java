package com.lhf.demo.springbootdubbozkuserserviceconsumer.service.impl;

import com.lhf.demo.springbootdubbozkcommon.entity.user.UserAddress;
import com.lhf.demo.springbootdubbozkcommon.service.order.OrderService;
import com.lhf.demo.springbootdubbozkcommon.service.user.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liuhongfei
 * @desc 订单服务实现
 * @since v1.0.0
 **/
@Component
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(Long userId) {
        List<UserAddress> userAddressByUserId = userService.getUserAddressByUserId(userId);
        return userAddressByUserId;
    }
}
