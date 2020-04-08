package com.demo.dubboprovider;

import java.io.IOException;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@DubboComponentScan(basePackages = "com.demo.dubboprovider.service.impl")
@ComponentScan
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboProviderApplication.class);
        context.start();
        System.out.println("dubbo-provider 启动成功");
        System.in.read();
    }
}
