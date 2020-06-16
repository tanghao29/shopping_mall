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


    //折线统计图

    //付款额
    public Integer zxPaymentOfnumber(Integer flag){
        Integer money=browseMapper.zxPaymentOfnumber(flag);
        if(null==money){
            money=0;
        }
        return money;
    }

      //退款
    public Integer zxRefundMoney(Integer flag){
        Integer money=browseMapper.zxRefundMoney(flag);
        if(null==money){
            money=0;
        }
        return money;
    }

    //付款人数
    public Integer zxPaymentCount(Integer flag){
        Integer money=browseMapper.zxPaymentCount(flag);
        if(null==money){
            money=0;
        }
        return money;
    }

    //付款件数
    public Integer zxPaymentOfnumberUser(Integer flag){
        Integer money=browseMapper.zxPaymentOfnumberUser(flag);
        if(null==money){
            money=0;
        }
        return money;
    }

    //浏览人数
    public Integer zxSearchbrowse(Integer flag){
        Integer money=browseMapper.zxSearchbrowse(flag);
        if(null==money){
            money=0;
        }
        return money;
    }

    //下单人数
    public Integer zxOrdersCount(Integer flag){
        Integer money=browseMapper.zxOrdersCount(flag);
        if(null==money){
            money=0;
        }
        return money;
    }

    //付款人数
    public Integer zxPaymentCountXuid(Integer flag){
        Integer money=browseMapper.zxPaymentCountXuid(flag);
        if(null==money){
            money=0;
        }
        return money;
    }

    //某个价钱段的订单
    public Integer mqHistogramcolumn(String starttime,String endtime,Integer startprice,Integer endprice){
        Integer count=browseMapper.mqHistogramcolumn(starttime,endtime,startprice,endprice);
        if(null==count){
            count=0;
        }
        return count;
    }
}
