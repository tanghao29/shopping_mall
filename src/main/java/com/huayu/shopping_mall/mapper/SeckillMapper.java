package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Seckill;
import com.huayu.shopping_mall.mapper.Provider.SeckillProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Mapper
public interface SeckillMapper extends BaseMapper<Seckill> {

    @SelectProvider(type =SeckillProvider.class,method ="queryLikeSeckill" )
    List<Seckill> queryLikeSeckill(Seckill seckill);

}
