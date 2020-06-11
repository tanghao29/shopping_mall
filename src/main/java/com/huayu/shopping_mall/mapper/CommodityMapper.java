package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.mapper.Provider.CommodityProvider;
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
public interface CommodityMapper extends BaseMapper<Commodity> {
//    @Select("SELECT c.*, SUM(ce.`cenumber`) cenumber, cc.ccname ccname FROM`commodity` c INNER JOIN `commodityentry` ce INNER JOIN `commodityclassification` cc WHERE c.cid = ce.cid AND c.ccid = cc.ccid GROUP BY c.`cid`")
@SelectProvider(type = CommodityProvider.class,method = "query")
    List<Commodity> queryCOmmodityList(Commodity commodity);
}
