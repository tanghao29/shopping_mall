package com.huayu.shopping_mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.utils.RespPageBean;

import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public interface IOrderformService extends IService<Orderform> {



    /**
     * 分页查询 订单列表
     * @return
     */
    RespPageBean getOrderByPage(Integer page, Integer size, Orderform orderform, Date[] beginDate);

    /**
     * 修改订单地址
     * @param orderform
     * @return
     */
    Integer updateOrder(Orderform orderform);

    /**
     * 修改订单状态
     * @param orderform
     * @return
     */
    Integer updateState(Orderform orderform);
}
