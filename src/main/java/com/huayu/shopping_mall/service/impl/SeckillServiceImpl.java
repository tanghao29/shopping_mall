package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Activities;
import com.huayu.shopping_mall.entity.Seckill;
import com.huayu.shopping_mall.mapper.ActivitiesMapper;
import com.huayu.shopping_mall.mapper.SeckillMapper;
import com.huayu.shopping_mall.service.ISeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
public class SeckillServiceImpl extends ServiceImpl<SeckillMapper, Seckill> implements ISeckillService {

    @Autowired
    private SeckillMapper seckillMapper;

    @Autowired
    private ActivitiesMapper activitiesMapper;

    @Override
    public List<Seckill> queryLikeSeckill(Seckill seckill) {

        List<Seckill> likeSeckill=seckillMapper.queryLikeSeckill(seckill);
        for (Seckill seckill1:likeSeckill){
            QueryWrapper<Activities> activitiesQueryWrapper=new QueryWrapper<>();
            activitiesQueryWrapper.eq("skid",seckill1.getSkid());
            seckill1.setSknubmer(activitiesMapper.selectList(activitiesQueryWrapper).size());
             Date date=new Date();

             System.out.println(date.compareTo(seckill1.getSkendtime())+1+"*************************************");
             System.out.println(seckill1.getSkendtime()+"*************************************");
             if(date.compareTo(seckill1.getSkstarttime())+1 >= 0 && date.compareTo(seckill1.getSkendtime())-1 <= 0 ){
                seckill1.setState("活动进行中");
             }else {
                 seckill1.setState("活动已结束");
                 seckill1.setSkstate("2");
                 seckillMapper.updateById(seckill1);
             }
        }

        return likeSeckill;
    }
}
