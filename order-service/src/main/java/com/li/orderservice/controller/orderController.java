package com.li.orderservice.controller;

import com.li.orderservice.service.GoodApi;
import com.li.orderservice.service.IntegralApi;
import com.li.orderservice.service.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName orderController
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 13:26
 * @Version 1.0
 */
@RestController
@RequestMapping("order")
public class orderController {
    @Autowired
    UserApi userApi;

    @Autowired
    GoodApi goodApi;

    @Autowired
    IntegralApi integralApi;

    @RequestMapping("/orderGetUser")
    public String orderGetUser(){
        return userApi.getUser();
    }

    @RequestMapping("/orderPayment")
    public Integer orderPayment(){
        Integer result1 = goodApi.reduceStock();
        Integer result2 = integralApi.addIntegral();

        return result1+result2;
    }




}
