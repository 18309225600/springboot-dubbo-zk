package com.lhf.demo.springbootdubbozkusersrviceprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class SpringbootDubboZkUserSrviceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboZkUserSrviceProviderApplication.class, args);
    }

}
