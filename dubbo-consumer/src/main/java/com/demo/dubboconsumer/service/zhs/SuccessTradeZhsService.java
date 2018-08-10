package com.demo.dubboconsumer.service.zhs;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.darcytech.api.hades.dto.ApiUser;
import com.darcytech.api.hades.dto.SuccessTradeZhsDto;
import com.darcytech.api.hades.service.SuccessTradeZhsServiceApi;

@Service
public class SuccessTradeZhsService {

    @Reference
    SuccessTradeZhsServiceApi successTradeZhsServiceApi;

    public List<SuccessTradeZhsDto> findSuccessTradeByTid(List<Long> tids){
        return successTradeZhsServiceApi.findSuccessTradeByTid(tids);
    }

    public String findQuickViewByUserId(ApiUser apiUser) {
        return successTradeZhsServiceApi.findQuickViewByUserId(apiUser);
    }

}
