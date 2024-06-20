package com.li.integralservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IntegralController
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 14:10
 * @Version 1.0
 */
@RestController
@RequestMapping("integral")
public class IntegralController {
    private static final Logger LOGGER= LoggerFactory.getLogger(IntegralController.class);

    @RequestMapping("/addIntegral")
    public Integer addIntegral(){
        LOGGER.info("调用积分服务，增加积分成功！！");
        return 1;
    }

}
