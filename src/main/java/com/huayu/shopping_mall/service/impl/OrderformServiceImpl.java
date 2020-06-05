package com.huayu.shopping_mall.service.impl;

import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.mapper.OrderformMapper;
import com.huayu.shopping_mall.service.IOrderformService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
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
    public RespPageBean getOrderByPage(Integer page, Integer size) {
        if(page !=null && size !=null){
            page = (page - 1) * size;
        }
        List<Orderform> list = orderformMapper.getOrderByPage(page, size);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(list);
        respPageBean.setTotal(orderformMapper.getTotal());
        return respPageBean;
    }
}
