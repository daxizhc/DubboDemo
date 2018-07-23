package com.demo.dubboconsumer.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.api.service.TestServiceApi;

@Service
public class TestService {

    @Reference
    TestServiceApi testServiceApi;

    public String test(){
        return testServiceApi.test();
    }

}
