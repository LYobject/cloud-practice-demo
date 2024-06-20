package com.li.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserApi
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 13:23
 * @Version 1.0
 */
@FeignClient("user-service")
@Service
public interface UserApi {

    @RequestMapping("user/getUser")
    String getUser();
}
