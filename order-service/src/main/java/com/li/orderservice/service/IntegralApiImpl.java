package com.li.orderservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName IntegralApiImpl
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 14:30
 * @Version 1.0
 */
@Service
public class IntegralApiImpl implements IntegralApi{
    private static final Logger LOGGER= LoggerFactory.getLogger(IntegralApi.class);

    @Override
    public Integer addIntegral() {
        LOGGER.info("积分服务出现异常，服务熔断！");
        return 0;
    }
}
