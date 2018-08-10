package com.demo.dubboconsumer.service;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.darcytech.api.hades.dto.ApiUser;
import com.darcytech.api.hades.dto.SuccessTradeZhsDto;
import com.demo.dubboconsumer.DubboConsumerApplication;
import com.demo.dubboconsumer.service.zhs.SuccessTradeZhsService;

public class SuccessTradeZhsServiceTest {

    private SuccessTradeZhsService successTradeZhsService;

    @Before
    public void setUp() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConsumerApplication.class);
        successTradeZhsService = context.getBean(SuccessTradeZhsService.class);
    }

    @Test
    public void findSuccessTradeByTid() {
        List<SuccessTradeZhsDto> dtos = successTradeZhsService.findSuccessTradeByTid(Collections.singletonList(770336320032167L));
        Assert.assertEquals(1, dtos.size());
        Assert.assertEquals(770336320032167L, dtos.get(0).getTid());
        Assert.assertEquals("汇乐母婴专营店:汇乐果果", dtos.get(0).getWangwangNick());
        Assert.assertEquals(2, dtos.get(0).getBindType().getValue().intValue());
    }

    @Test
    public void findQuickViewByUserId() {
        ApiUser apiUser = new ApiUser("jin_xingxing");
        String quickView = successTradeZhsService.findQuickViewByUserId(apiUser);
        Assert.assertEquals("pay", quickView);
    }
}