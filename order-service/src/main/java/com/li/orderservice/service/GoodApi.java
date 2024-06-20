package com.li.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName GoodApi
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 14:13
 * @Version 1.0
 */
@Service
@FeignClient("goods-service")
public interface GoodApi {

    @RequestMapping("/goods/reduceStock")
    Integer reduceStock();
}
