package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.CommodityClassificationData;
import com.huayu.shopping_mall.entity.Commodityclassification;
import com.huayu.shopping_mall.mapper.CommodityclassificationMapper;
import com.huayu.shopping_mall.service.ICommodityclassificationService;
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
public class CommodityclassificationServiceImpl extends ServiceImpl<CommodityclassificationMapper, Commodityclassification> implements ICommodityclassificationService {

    @Autowired
    CommodityclassificationMapper commodityclassificationMapper;

    public List<String> commodityClassification(){
        return commodityclassificationMapper.commodityClassification();
    }

    public List<CommodityClassificationData> commodityClassificationData(){
        return commodityclassificationMapper.commodityClassificationdata();
    }

    public List<CommodityClassificationData> commodityClassificationmoney(){
        return commodityclassificationMapper.commodityClassificationmoney();
    }

}
