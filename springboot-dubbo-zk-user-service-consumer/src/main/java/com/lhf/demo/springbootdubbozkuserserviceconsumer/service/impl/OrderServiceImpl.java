package com.lhf.demo.springbootdubbozkuserserviceconsumer.service.impl;

import com.lhf.demo.springbootdubbozkcommon.entity.user.UserAddress;
import com.lhf.demo.springbootdubbozkcommon.service.order.OrderService;
import com.lhf.demo.springbootdubbozkcommon.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuhongfei
 * @desc 订单服务实现
 * @since v1.0.0
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(Long userId) {
        List<UserAddress> userAddressByUserId = userService.getUserAddressByUserId(userId);
        System.out.println(userAddressByUserId);
    }
}
