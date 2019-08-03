# dubbo-zk
## dubbo官方服务最佳化实践推荐做法：
### 建议将服务接口、服务模型、服务异常等均放在 API 包中，因为服务模型和异常也是 API 的一部分，这样做也符合分包原则：重用发布等价原则(REP)，共同重用原则(CRP)。
>   文档地址：https://dubbo.apache.org/zh-cn/docs/user/best-practice.html
* dubbo-zk-common 存放公共的Service、Entity、Exception等信息
* user-service-comsumer 具体的一个消费者
* user-service-provider 具体的一个提供者

## dubbo使用步骤：
0. 配置文件中配置应用名称和注册中心
1. 将服务提供者注册到注册中心（暴露服务@Service）
2. 让服务消费者去注册中心订阅服务提供者（@Reference） 
* 引入dubbo（2.6.2）依赖
    >      <dependency>
    >          <groupId>org.apache.dubbo</groupId>
    >          <artifactId>dubbo-spring-boot-starter</artifactId>
    >          <version>2.7.1</version>
    >      </dependency>
    >      <dependency>
    >          <groupId>org.apache.dubbo</groupId>
    >          <artifactId>dubbo</artifactId>
    >          <version>2.7.1</version>
    >      </dependency>
* 引入操作zookeeper的客户端curator依赖
   >         <dependency>
   >            <groupId>org.apache.curator</groupId>
   >            <artifactId>curator-framework</artifactId>
   >            <version>2.12.0</version>
   >         </dependency>
   >         <dependency>
   >            <groupId>org.apache.curator</groupId>
   >            <artifactId>curator-recipes</artifactId>
   >            <version>2.8.0</version>
   >        </dependency>
   
*  配置文件中：
   > dubbo:
   >   application:
   >     name: springboot-dubbo-zk-user-srvice-provider
   >   registry:
   >     address: 192.168.47.133:2181,192.168.47.133:2182,192.168.47.133:2183
   >     protocol: zookeeper
   
*  zk集群docker-compose.yml

```
version: '3.1'
services:
  zoo1:
    image: zookeeper:3.4.11
    restart: always
    hostname: zoo1
    container_name: zookeeper_1
    #domainname: 
    ports:
      - 2181:2181
    volumes:
      - /usr/local/docker_app/zookeeper/zoo1/data:/data
      - /usr/local/docker_app/zookeeper/zoo1/datalog:/datalog
    environment:
      ZOO_MY_ID: 1
      ZOO_SERVERS: server.1=zoo1:2888:3888 server.2=zoo2:2888:3888 server.3=zoo3:2888:3888

  zoo2:
    image: zookeeper:3.4.11
    restart: always
    hostname: zoo2
    container_name: zookeeper_2
    ports:
      - 2182:2181
    volumes:
      - /usr/local/docker_app/zookeeper/zoo2/data:/data
      - /usr/local/docker_app/zookeeper/zoo2/datalog:/datalog
    environment:
      ZOO_MY_ID: 2
      ZOO_SERVERS: server.1=zoo1:2888:3888 server.2=zoo2:2888:3888 server.3=zoo3:2888:3888

  zoo3:
    image: zookeeper:3.4.11
    restart: always
    hostname: zoo3
    container_name: zookeeper_3
    ports:
      - 2183:2181
    volumes:
      - /usr/local/docker_app/zookeeper/zoo3/data:/data
      - /usr/local/docker_app/zookeeper/zoo3/datalog:/datalog
    environment:
      ZOO_MY_ID: 3
      ZOO_SERVERS: server.1=zoo1:2888:3888 server.2=zoo2:2888:3888 server.3=zoo3:2888:3888
```