package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.dynamic.Searchbrowse;
import com.huayu.shopping_mall.entity.Browse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mq
 * @since 2020-06-11
 */

@Mapper
public interface BrowseMapper extends BaseMapper<Browse> {

    @SelectProvider(type = Searchbrowse.class,method = "searchbrowse")
    Integer searchbrowse(String nb,String time);

    @SelectProvider(type = Searchbrowse.class,method = "ordersCount")
    Integer ordersCount(String nb,String time);

    //订单数
    @SelectProvider(type = Searchbrowse.class,method = "ordersCounts")
    Integer ordersCounts(String nb,String time);

    //下单件数
    @SelectProvider(type = Searchbrowse.class,method = "sumofnumber")
    Integer sumofnumber(String nb,String time);

    //有效订单数
    @SelectProvider(type = Searchbrowse.class,method = "yxordersCounts")
    Integer yxordersCounts(String nb,String time);

    //下单金额
    @SelectProvider(type = Searchbrowse.class,method = "ordersMontey")
    Integer ordersMontey(String nb,String time);


    //退款金额
    @SelectProvider(type = Searchbrowse.class,method = "refundMoney")
    Integer refundMoney(String nb,String time);

    //付款人数
    @SelectProvider(type = Searchbrowse.class,method = "paymentCount")
    Integer paymentCount(String nb,String time);



    //付款订单数量
    @SelectProvider(type = Searchbrowse.class,method = "paymentOrderCount")
    Integer paymentOrderCount(String nb,String time);


    //付款件数
    @SelectProvider(type = Searchbrowse.class,method = "paymentOfnumber")
    Integer paymentOfnumber(String nb,String time);


    //付款金额
    @SelectProvider(type = Searchbrowse.class,method = "paymentOfmoney")
    Integer paymentOfmoney(String nb,String time);


    //折线统计 付款金额
     @SelectProvider(type = Searchbrowse.class,method = "zxPaymentOfnumber")
     Integer zxPaymentOfnumber(Integer flag);


    //折线统计 退款金额
    @SelectProvider(type = Searchbrowse.class,method = "zxRefundMoney")
    Integer zxRefundMoney(Integer flag);


    //折线统计 退款金额
    @SelectProvider(type = Searchbrowse.class,method = "zxPaymentCount")
    Integer zxPaymentCount(Integer flag);


    //折线统计 付款件数
    @SelectProvider(type = Searchbrowse.class,method = "zxPaymentOfnumberUser")
    Integer zxPaymentOfnumberUser(Integer flag);

    //折线统计 浏览人数
    @SelectProvider(type = Searchbrowse.class,method = "zxSearchbrowse")
    Integer zxSearchbrowse(Integer flag);

    //折线统计 下单人数
    @SelectProvider(type = Searchbrowse.class,method = "zxOrdersCount")
    Integer zxOrdersCount(Integer flag);

    //折线统计 付款人数
    @SelectProvider(type = Searchbrowse.class,method = "zxPaymentCountXuid")
    Integer zxPaymentCountXuid(Integer flag);

    //柱状图
    @SelectProvider(type = Searchbrowse.class,method = "mqHistogramcolumn")
    Integer mqHistogramcolumn(String starttime,String endtime,Integer startprice,Integer endprice);

}
