package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Orderform;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Mapper
public interface OrderformMapper extends BaseMapper<Orderform> {

    /**
     * 分页查询订单列表
     *
     * @param page
     * @param size
     * @return
     */
    List<Orderform> getOrderByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("order") Orderform orderform, @Param("beginDate") Date[] beginDate);


    /**
     * 查询总条数
     *
     * @return
     */
    Long getTotal(@Param("order") Orderform orderform, @Param("beginDate") Date[] beginDate);

    Integer updateByPrimaryKeySelective(@Param("orderform") Orderform orderform);


    /*
    * 查询当天的订单数量
    * */
    @Select("select count(1) from  orderform where  to_days(ofdate) = to_days(now())")
    public Integer orderformcount();

    /*
     * 查询当天的销售总额
     * */
    @Select("select sum(ofmoney) from  orderform where  to_days(ofdate) = to_days(now()) and ofstate='1' ")
    public Integer totalsalescount();

    /*
     * 查询昨天的销售总额
     * */
    @Select("select sum(ofmoney) from  orderform where TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 and ofstate='1' ")
    public Integer yesterdaytotalsalescount();

    /*
     * 查询近7天的销售总额
     * */
    @Select("select sum(ofmoney) from  orderform where DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) and ofstate='1' ")
    public Integer weekcount();

}
