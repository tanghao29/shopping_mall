package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.mapper.CommodityMapper;
import com.huayu.shopping_mall.mapper.CommodityentryMapper;
import com.huayu.shopping_mall.service.ICommodityService;
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
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements ICommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    private CommodityentryMapper commodityentryMapper;

  @Override
    public List<Commodity> queryCOmmodityList(Commodity commodity) {
        return commodityMapper.queryCOmmodityList(commodity);
    }

    @Override
    public List<Commodity> queryListCommodtiy() {
        return commodityMapper.selectList(null);
    }

    public Integer sold(){
        return commodityMapper.sold();
    }

    public Integer putaway(){
        return commodityMapper.putaway();
    }

    public Integer inventory(){
        return commodityMapper.inventory();
    }

    public Integer countCommodityentry(){
        return commodityMapper.countCommodityentry();
    }



}
