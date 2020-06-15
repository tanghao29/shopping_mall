package com.huayu.shopping_mall.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Commodityentry;
import com.huayu.shopping_mall.entity.Specification;
import com.huayu.shopping_mall.mapper.CommodityentryMapper;
import com.huayu.shopping_mall.mapper.SpecificationMapper;
import com.huayu.shopping_mall.service.ICommodityentryService;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
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
    CommodityentryMapper commodityentryMapper;

    @Autowired
    SpecificationMapper specificationMapper;


    @Override
    public RespPageBean getAllGoodInByPage(Integer page, Integer size, Commodityentry commodityentry, Date[] beginDate, String uname) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Commodityentry> data = commodityentryMapper.getAllGoodInByPage(page, size, commodityentry, beginDate, uname);
//        Long total = goodsInMapper.getTotal(commodityentry, beginDate,uname);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(data);
        long total = data.size();
        respPageBean.setTotal(total);
        return respPageBean;
    }

    @Override
    public List<Commodityentry> queryCommodityentryList(Integer cid) {

        QueryWrapper<Commodityentry> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cid", cid);
        List<Commodityentry> commodityentryList = commodityentryMapper.selectList(queryWrapper);


        for (Commodityentry commodityentry : commodityentryList) {
            System.out.println(commodityentry + "-------------------------------------------888888888888888888888");
            QueryWrapper<Specification> specificationQueryWrapper = new QueryWrapper<>();
            specificationQueryWrapper.eq("sid", commodityentry.getSid());
            commodityentry.setSname(specificationMapper.selectOne(specificationQueryWrapper).getSname());
            System.out.println(commodityentry + "--------------------------------------9999999999999");
        }

        return commodityentryList;
    }


    @Override
    public Integer addGoods(Commodityentry commodityentry) {
        Date nowTime = new Date();
        SimpleDateFormat time = new SimpleDateFormat("yyy-MM-dd");
        String format = time.format(nowTime);
        commodityentry.setCedate(format);
//        return goodsInMapper.insertSelective(commodityentry);
        return commodityentryMapper.insert(commodityentry);
    }
}
