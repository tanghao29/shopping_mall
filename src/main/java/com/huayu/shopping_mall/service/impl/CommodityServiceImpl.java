package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.mapper.CommodityMapper;
import com.huayu.shopping_mall.mapper.CommodityentryMapper;
import com.huayu.shopping_mall.mapper.OrderformMapper;
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

    @Autowired
    private OrderformMapper orderformMapper;


  @Override
    public List<Commodity> queryCOmmodityList(Commodity commodity) {
      List<Commodity> commodityList = commodityMapper.queryCOmmodityList(commodity);
      for(Commodity commodity1:commodityList){
          QueryWrapper<Orderform > orderformQueryWrapper=new QueryWrapper<>();
          orderformQueryWrapper.eq("cid",commodity1.getCid());
          commodity1.setNumber(orderformMapper.selectList(orderformQueryWrapper).size());
      }
        return commodityList;
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
