package com.demo.dubboconsumer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.dubboconsumer.service.TestService;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.demo.dubboconsumer.service")
public class DubboConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);
        TestService testService = context.getBean(TestService.class);
        System.out.println(testService.test());
    }
}
