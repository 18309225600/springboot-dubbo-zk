package com.lhf.demo.springbootdubbozkcommon.service.user;

import com.lhf.demo.springbootdubbozkcommon.entity.user.UserAddress;

import java.util.List;

/**
 * @author liuhongfei
 * @since v1.0.0
 **/
public interface UserService {
    List<UserAddress> getUserAddressByUserId(Long userId);
}
