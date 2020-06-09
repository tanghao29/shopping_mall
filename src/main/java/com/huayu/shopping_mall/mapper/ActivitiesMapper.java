package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Activities;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mq
 * @since 2020-06-09
 */
@Mapper
public interface ActivitiesMapper extends BaseMapper<Activities> {

    @Select("select * from activities a inner join commodity c on a.cid=c.cid and a.skid=#{value}")
    List<Activities> queryActiviries(Integer skid);
}
