package com.lhf.demo.springbootdubbozkuserserviceconsumer.controller;

import com.lhf.demo.springbootdubbozkcommon.entity.user.UserAddress;
import com.lhf.demo.springbootdubbozkcommon.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuhongfei
 * @desc TODO
 * @since v1.0.0
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getAddr",method = RequestMethod.GET)
    public List<UserAddress> getAddress(Long userId){
        return orderService.initOrder(userId);
    }
}
