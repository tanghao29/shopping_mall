package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Commodityentry;
import com.huayu.shopping_mall.mapper.CommodityentryMapper;
import com.huayu.shopping_mall.service.ICommodityentryService;
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
public class CommodityentryServiceImpl extends ServiceImpl<CommodityentryMapper, Commodityentry> implements ICommodityentryService {

    @Autowired
    CommodityentryMapper goodsInMapper;


    @Override
    public RespPageBean getAllGoodInByPage(Integer page, Integer size, Commodityentry commodityentry, Date[] beginDate) {
//        if (page != null && size != null) {
//            page = (page - 1) * size;
//        }
        List<Commodityentry> data =  goodsInMapper.getAllGoodInByPage(page,size,commodityentry,beginDate);
        Long total = goodsInMapper.getTotal(commodityentry,beginDate);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(data);
        respPageBean.setTotal(total);
        return respPageBean;
    }
}
