package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.entity.Week;
import com.huayu.shopping_mall.entity.WeekMoney;
import com.huayu.shopping_mall.mapper.OrderformMapper;
import com.huayu.shopping_mall.service.IOrderformService;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Service
public class OrderformServiceImpl extends ServiceImpl<OrderformMapper, Orderform> implements IOrderformService {

    @Autowired
    OrderformMapper orderformMapper;


    @Override
    public RespPageBean getOrderByPage(Integer page, Integer size, Orderform orderform, Date[] beginDate) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Orderform> data =  orderformMapper.getOrderByPage(page, size, orderform, beginDate);
        Long total = orderformMapper.getTotal(orderform, beginDate);
        RespPageBean bean = new RespPageBean();
        bean.setTotal(total);
        bean.setData(data);
        return bean;
    }

    @Override
    public Integer updateOrder(Orderform orderform) {
        return orderformMapper.updateByPrimaryKeySelective(orderform);
    }


    @Override
    public Integer updateState(Orderform orderform) {
        return orderformMapper.updateByPrimaryKeySelective(orderform);
    }

    public Integer orderformcount(){
        return orderformMapper.orderformcount();
    }

    public Integer totalsalescount(){ return  orderformMapper.totalsalescount();}

    public Integer yesterdaytotalsalescount(){
        return orderformMapper.yesterdaytotalsalescount();
    }

    public Integer weekcount(){
        return orderformMapper.weekcount();
    }

    public Week selectWeek(){
        return orderformMapper.selectWeek();
    }

    public Week yesterWeek(){
        return orderformMapper.yesterWeek();
    }

    public WeekMoney selectWeekMoney(){
        return orderformMapper.selectWeekMoney();
    }

    public WeekMoney yesterWeekMoney(){
        return orderformMapper.yesterWeekMoney();
    }
}
