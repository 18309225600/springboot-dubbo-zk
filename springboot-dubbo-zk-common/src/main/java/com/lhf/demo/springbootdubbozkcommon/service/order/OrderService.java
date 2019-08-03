package com.lhf.demo.springbootdubbozkcommon.service.order;

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
    void initOrder(Long userId);
}
