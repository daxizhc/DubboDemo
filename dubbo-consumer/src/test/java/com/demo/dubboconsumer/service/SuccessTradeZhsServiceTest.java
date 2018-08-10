package com.demo.dubboconsumer.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.darcytech.api.hades.dto.ApiUser;
import com.darcytech.api.hades.dto.QuickViewDto;
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
        List<SuccessTradeZhsDto> dtos = successTradeZhsService.findSuccessTradeByTid(Arrays.asList(766303944516062L,
                770336320032167L, 879021352973255L));
        Assert.assertEquals(7, dtos.size());
    }

    @Test
    public void findQuickViewByUserId() {
        ApiUser apiUser = new ApiUser("jin_xingxing");
        QuickViewDto quickView = successTradeZhsService.findQuickViewByUserId(apiUser);
        Assert.assertEquals(QuickViewDto.PAID, quickView);
    }
}