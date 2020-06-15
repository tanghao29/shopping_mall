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




}
