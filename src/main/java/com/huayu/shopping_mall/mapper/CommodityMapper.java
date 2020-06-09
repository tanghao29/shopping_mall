package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
public interface CommodityMapper extends BaseMapper<Commodity> {
    @Select("SELECT * FROM commodity c LEFT JOIN commodityentry ce ON c.cid=ce.cid  LEFT JOIN commodityclassification cc  ON c.ccid=cc.ccid ")
    List<Commodity> queryCOmmodityList();
}
