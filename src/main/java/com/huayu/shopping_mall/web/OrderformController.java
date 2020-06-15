package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.service.impl.OrderformServiceImpl;
import com.huayu.shopping_mall.utils.RespBean;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    /**
     * 分页查询订单列表
     * @param page
     * @param size
     * @param orderform
     * @param beginDate
     * @return
     */
    @GetMapping("/")
    public RespPageBean queryAllOrders(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,Orderform orderform,Date[] beginDate) {
        return orderformService.getOrderByPage(page,size,orderform,beginDate);
    }

    @PutMapping("/")
    public RespBean updateOrder(@RequestBody Orderform orderform){
        if(orderformService.updateOrder(orderform) == 1){
            return RespBean.ok("地址修改成功");
        }
        return RespBean.error("地址修改失败");
    }

    /*
    * mengqi
    * 查询当天的订单总数
    * */
    @GetMapping("/orderformcount")
    @ResponseBody
    public Integer orderformcount(){
        return orderformService.orderformcount();
    }

    /*
    * mengqi
    * 查询当天的销售总额
    * */
    @GetMapping("/totalsalescount")
    @ResponseBody
    public  Integer totalsalescount(){
        return orderformService.totalsalescount();
    }

    /*
     * mengqi
     * 查询当天的销售总额
     * */
    @GetMapping("/yesterdaytotalsalescount")
    @ResponseBody
    public  Integer yesterdaytotalsalescount(){
        return orderformService.yesterdaytotalsalescount();
    }

    /*
     * mengqi
     * 查询近7天的销售总额
     * */
    @GetMapping("/weekcount")
    @ResponseBody
    public  Integer weekcount(){
        return orderformService.weekcount();
    }


}
