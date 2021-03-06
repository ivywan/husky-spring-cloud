package com.husky.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.husky.cloud"})
@MapperScan(basePackages = {"com.husky.cloud.mapper.user"})
@SpringBootApplication
public class Application6601 {
    public static void main(String[] args) {
        SpringApplication.run(Application6601.class,args) ;
    }
}
