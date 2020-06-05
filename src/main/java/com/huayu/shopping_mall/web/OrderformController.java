package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.service.impl.OrderformServiceImpl;
import com.huayu.shopping_mall.utils.RespBean;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@RestController
@RequestMapping("/shopping_mall/orderform")
public class OrderformController {

    @Autowired
    OrderformServiceImpl orderformService;

    @GetMapping("/")
    public RespPageBean queryAllOrders(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        return orderformService.getOrderByPage(page,size);
    }


}
