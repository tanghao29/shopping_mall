package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.CommodityClassificationData;
import com.huayu.shopping_mall.entity.Commodityclassification;
import com.huayu.shopping_mall.entity.Commoditystatistics;
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

    public List<String> commodityClassification(String time){
        return commodityclassificationMapper.commodityClassification(time);
    }

    public List<CommodityClassificationData> commodityClassificationData(String time){
        return commodityclassificationMapper.commodityClassificationdata(time);
    }

    public List<CommodityClassificationData> commodityClassificationmoney(String time){
        return commodityclassificationMapper.commodityClassificationmoney(time);
    }

    public List<Commoditystatistics> commoditystatistics(String time){
        return commodityclassificationMapper.commoditystatistics(time);
    }


    public List<String> category(){
        return commodityclassificationMapper.category();
    }

    public Integer [] categoryData(Integer time,String ccname){
        Integer [] in=new Integer[time];
        for (Integer integer = 0; integer < time; integer++) {
           Integer nb=commodityclassificationMapper.categoryData(integer,ccname);
           if(nb==null){
               in[time-1-integer]=0;
           }else{
          in[time-1-integer]=nb;
        }}
        return in;
    }


    public List<String> jymq(){
        return commodityclassificationMapper.category();
    }

    public List<CommodityClassificationData> countliebie(){
        return commodityclassificationMapper.countliebie();
    }

}
