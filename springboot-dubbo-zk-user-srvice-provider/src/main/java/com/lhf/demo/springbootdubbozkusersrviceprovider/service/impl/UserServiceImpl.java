package com.lhf.demo.springbootdubbozkusersrviceprovider.service.impl;

import com.lhf.demo.springbootdubbozkcommon.entity.user.UserAddress;
import com.lhf.demo.springbootdubbozkcommon.service.user.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author liuhongfei
 * @desc 用户服务实现
 * @since v1.0.0
 **/

@Service //暴露服务
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressByUserId(Long userId) {
        UserAddress address1 = new UserAddress(1L,"西安市，都市之门C座302B",3L,"刘宏飞","18309225600",true);
        UserAddress address2 = new UserAddress(2L,"西安市，延平门创业广场701",3L,"刘宏飞","17382568276",true);
        return Arrays.asList(address1, address2);
    }
}
