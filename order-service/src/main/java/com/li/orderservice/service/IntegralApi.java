package com.li.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IntegralApi
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 14:17
 * @Version 1.0
 */
@FeignClient(value = "integral-service",fallback = IntegralApiImpl.class)
public interface IntegralApi {

    @RequestMapping("integral/addIntegral")
    Integer addIntegral();
}
