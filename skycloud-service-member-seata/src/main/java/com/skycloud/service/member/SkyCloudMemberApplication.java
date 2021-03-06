package com.skycloud.service.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 *
 * @author
 */
@ComponentScan(basePackages = "com.skycloud")
@EnableFeignClients(basePackages = "com.skycloud")
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy=true)
public class SkyCloudMemberApplication {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SkyCloudMemberApplication.class, args);
    }


}
