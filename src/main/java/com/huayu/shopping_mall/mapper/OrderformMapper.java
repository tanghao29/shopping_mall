package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.huayu.shopping_mall.entity.Orderform;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

}
