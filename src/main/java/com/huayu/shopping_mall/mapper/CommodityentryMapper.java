package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Commodityentry;
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
public interface CommodityentryMapper extends BaseMapper<Commodityentry> {

    /**
     * 分页查询入库信息
     *
     * @param page
     * @param size
     * @param commodityentry
     * @param beginDate
     * @return
     */
    List<Commodityentry> getAllGoodInByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("commodityentry") Commodityentry commodityentry, @Param("beginDate") Date[] beginDate);

    Long getTotal(@Param("commodityentry") Commodityentry commodityentry, @Param("beginDate") Date[] beginDate);
}
