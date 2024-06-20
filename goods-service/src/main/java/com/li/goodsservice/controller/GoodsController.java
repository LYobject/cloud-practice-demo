package com.li.goodsservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodsController
 * @Description TODO
 * @Author LiYe
 * @Date 2024/6/20 13:55
 * @Version 1.0
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    private static final Logger LOGGER= LoggerFactory.getLogger(GoodsController.class);

    @RequestMapping("/reduceStock")
    public Integer reduceStock(){
        LOGGER.info("商品服务被调用，扣减库存成功！");
        return 1;
    }

}
