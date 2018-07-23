package com.demo.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.service.TestServiceApi;

@Service
public class TestServiceApiImpl implements TestServiceApi {

    public String test() {
        return "hello world !";
    }
}
