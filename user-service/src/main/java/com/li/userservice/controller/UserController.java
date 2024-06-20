package com.li.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 11:31
 * @Version 1.0
 */
@RequestMapping("user")
@RestController
public class UserController {
    @Value("${spring.application.name}")
    private String serverName;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/getUser")
    public String getServerName(){
        return String.format("服务名：%s，端口：%s",serverName,port);
    }
}
