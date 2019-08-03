package com.lhf.demo.springbootdubbozkcommon.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liuhongfei
 * @desc 用户收获地址
 * @since v1.0.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {
    //id
    private Long id;
    //收获地址
    private String userAddress;
    //用户ID
    private Long userId;
    //签收人
    private String consignee;
    //手机号
    private String phone;
    //是否默认
    private boolean isDefault;
}
