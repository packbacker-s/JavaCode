package com.huangminghao.cloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //激活Eureka服务器相关配置EurekaServerAutoConfiguration的注释
                    //在项目启动类上使用@EnableEurekaServer，可以将项目作为SpringCloud中的注册中心
public class CloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class, args);
    }

}
