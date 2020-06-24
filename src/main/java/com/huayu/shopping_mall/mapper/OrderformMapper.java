package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.entity.Week;
import com.huayu.shopping_mall.entity.WeekMoney;
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


    /*
    * 查询近7天的订单数
    *
    * */
    @Select("select (select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 0 day) ) as day1,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 1 day) ) as day2,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 2 day) ) as day3 ,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 3 day) ) as day4,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 4 day) ) as day5,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 5 day) ) as day6,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 6 day) ) as day7 ")
    public Week selectWeek();

    /*
     * 查询上7天的订单数
     *
     * */
    @Select("select (select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 7 day) ) as day1,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 8 day) ) as day2,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 9 day) ) as day3 ,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 10 day) ) as day4,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 11 day) ) as day5,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 12 day) ) as day6,(select count(1) from orderform where date( ofdate) = date_sub(curdate(),interval 13 day) ) as day7 ")
    public Week yesterWeek();

    /*
     * 查询近7天的销售额
     *
     * */
    @Select("select (select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 0 day) ) as day1,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 1 day) ) as day2,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 2 day) ) as day3,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 3 day) ) as day4,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 4 day) ) as day5,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 5 day) ) as day6,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 6 day) ) as day7 ")
    public WeekMoney selectWeekMoney();

    /*
     * 查询上7天的销售额
     *
     * */
    @Select("select (select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 7 day) ) as day1,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 8 day) ) as day2,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 9 day) ) as day3,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 10 day) ) as day4,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 11 day) ) as day5,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 12 day) ) as day6,(select sum(ofmoney) from  orderform where ofstate='1' and  date( ofdate) = date_sub(curdate(),interval 13 day) ) as day7 ")
    public WeekMoney yesterWeekMoney();


    @Select(" select * from orderform where ofstate='1' order by ofdate desc limit 8  ")
    public List<Orderform> thelatestorder();
}
