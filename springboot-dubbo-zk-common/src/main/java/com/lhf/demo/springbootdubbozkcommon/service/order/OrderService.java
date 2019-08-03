package com.lhf.demo.springbootdubbozkcommon.service.order;

import com.lhf.demo.springbootdubbozkcommon.entity.user.UserAddress;

import java.util.List;

/**
 * @author liuhongfei
 * @desc 用户服务的消费服务-订单服务
 * @since v1.0.0
 **/
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    List<UserAddress> initOrder(Long userId);
}
