package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Activities;
import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.entity.Salesreturn;
import com.huayu.shopping_mall.mapper.ActivitiesMapper;
import com.huayu.shopping_mall.mapper.OrderformMapper;
import com.huayu.shopping_mall.mapper.SalesreturnMapper;
import com.huayu.shopping_mall.service.ISalesreturnService;
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
public class SalesreturnServiceImpl extends ServiceImpl<SalesreturnMapper, Salesreturn> implements ISalesreturnService {

    @Autowired
    private SalesreturnMapper salesreturnMapper;

    @Autowired
    private OrderformMapper orderformMapper;

    @Autowired
    private ActivitiesMapper activitiesMapper;

    public List<Salesreturn> querySalesreturn(Salesreturn salesreturn){
        QueryWrapper<Salesreturn> queryWrapper=new QueryWrapper<>();
        if(salesreturn.getOfid()!=null && salesreturn.getOfid().toString()!=""){
            queryWrapper.eq("ofid",salesreturn.getOfid());
        }
        if(salesreturn.getAsid()!=null&&salesreturn.getAsid().toString()!=""){
            queryWrapper.eq("asid",salesreturn.getAsid());
        }
        if(salesreturn.getSrstate()!=""&&salesreturn.getSrstate()!=null){
            queryWrapper.eq("srstate",salesreturn.getSrstate());
        }
        if(salesreturn.getSrsqdate()!=null && salesreturn.getSrsqdate().toString()!="" && salesreturn.getSrsqdateover()==null &&salesreturn.getSrsqdateover().toString()==""){
            queryWrapper.eq("srsqdate",salesreturn.getSrsqdate());
        }
        if(salesreturn.getSrsqdate()!=null && salesreturn.getSrsqdate().toString()!="" && salesreturn.getSrsqdateover()!=null &&salesreturn.getSrsqdateover().toString()!=""){
            queryWrapper.between("srsqdate",salesreturn.getSrsqdate(),salesreturn.getSrsqdateover());
        }

        List<Salesreturn> salesreturnList = salesreturnMapper.selectList(queryWrapper);

        for (Salesreturn salesreturn1:salesreturnList){

            QueryWrapper<Orderform> queryWrapper1 = new QueryWrapper<>();
            queryWrapper1.eq("ofid",salesreturn1.getOfid());
            salesreturn1.setOrderform(orderformMapper.selectOne(queryWrapper1));

            QueryWrapper<Activities> queryWrapper2 = new QueryWrapper<>();
            queryWrapper2.eq("asid",salesreturn1.getAsid());
            salesreturn1.setActivities(activitiesMapper.selectOne(queryWrapper2));
        }

        return salesreturnList;
    }
}
