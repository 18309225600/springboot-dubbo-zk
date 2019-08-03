# dubbo-zk

* dubbo-zk-common 存放公共的Service、Entity、Exception等信息
* user-service-comsumer 具体的一个消费者
* user-service-provider 具体的一个提供者

## dubbo使用步骤：
1. 将服务提供者注册到注册中心（暴露服务）
   * 引入dubbo（2.6.2）依赖（如果使用springboot，可使用starter）
   >        <dependency>
   >            <groupId>com.alibaba</groupId>
   >            <artifactId>dubbo</artifactId>
   >            <version>2.6.2</version>
   >        </dependency>
   * 引入操作zookeeper的客户端curator依赖
    >        <dependency>
    >           <groupId>org.apache.curator</groupId>
    >           <artifactId>curator-framework</artifactId>
    >           <version>2.12.0</version>
    >       </dependency>
    * 配置服务提供者
    1.  配置应用名称
    2.  配置注册中心
    
2. 让服务消费者去注册中心订阅服务提供者 
