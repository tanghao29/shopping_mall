package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Browse;
import com.huayu.shopping_mall.mapper.BrowseMapper;
import com.huayu.shopping_mall.service.IBrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mq
 * @since 2020-06-11
 */
@Service
public class BrowseServiceImpl extends ServiceImpl<BrowseMapper, Browse> implements IBrowseService {

    @Autowired
    BrowseMapper browseMapper;

    public Integer searchbrowse(String nb,String time){
        return browseMapper.searchbrowse(nb,time);
    }

    public Integer ordersCount(String nb,String time){
        return browseMapper.ordersCount(nb,time);
    }

    public Integer ordersCounts(String nb,String time){
        return browseMapper.ordersCounts(nb,time);
    }

    public Integer sumofnumber(String nb,String time){
        return browseMapper.sumofnumber(nb,time);
    }
    public Integer yxordersCounts(String nb,String time){
        return browseMapper.yxordersCounts(nb,time);
    }

    public Integer ordersMontey(String nb,String time){
        return browseMapper.ordersMontey(nb,time);
    }


    public Integer refundMoney(String nb,String time){
        Integer i=0;
        i=browseMapper.refundMoney(nb,time);
        if(null==i){
           i=0;
        }
        return i;
    }


    public Integer paymentCount(String nb,String time){
        Integer i=0;
        i=browseMapper.paymentCount(nb,time);
        if(null==i){
           i=0;
        }
        return i;
    }

    public Integer paymentOrderCount(String nb,String time){
        Integer i=0;
        i=browseMapper.paymentOrderCount(nb,time);
        if(null==i){
           i=0;
        }
        return i;
    }


    public Integer paymentOfnumber(String nb,String time){
        Integer i=0;
        i=browseMapper.paymentOfnumber(nb,time);
        if(null==i){
           i=0;
        }
        return i;
    }
    public Integer paymentOfmoney(String nb,String time){
        Integer i=0;
        i=browseMapper.paymentOfmoney(nb,time);
        if(null==i){
           i=0;
        }
        return i;
    }



}
