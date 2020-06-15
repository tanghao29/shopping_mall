package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Stockremoval;
import com.huayu.shopping_mall.vo.StockremovalVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
public interface StockremovalMapper extends BaseMapper<Stockremoval> {

    List<Stockremoval> getAllReturnGoods(@Param("stockremovalVo") StockremovalVo stockremovalVo);
}
