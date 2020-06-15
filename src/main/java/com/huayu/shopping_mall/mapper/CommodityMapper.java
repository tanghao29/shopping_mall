package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.mapper.Provider.CommodityProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
    @Select("SELECT * FROM commodity c LEFT JOIN commodityentry ce ON c.cid=ce.cid  LEFT JOIN commodityclassification cc  ON c.ccid=cc.ccid ")
    List<Commodity> queryCOmmodityList();

    /*
    * mengqi
    * 已下架
    * */
    @Select(" select count(1) from commodity where cstate=0 ")
    Integer sold();

    /*
     * mengqi
     * 已下架
     * */
    @Select(" select count(1) from commodity where cstate=0 ")
    Integer putaway();

    /*
    * mengqi
    * 库春紧张
    * */
    @Select(" select count(1) from (select  cid from commodityentry  group by cid having sum(cenumber) <50 ) a ")
    Integer  inventory();

    /*
    * mengqi
    * 全部商品
    * */
    @Select(" select count(1) from commodityentry ")
    Integer countCommodityentry();

//    @Select("SELECT c.*, SUM(ce.`cenumber`) cenumber, cc.ccname ccname FROM`commodity` c INNER JOIN `commodityentry` ce INNER JOIN `commodityclassification` cc WHERE c.cid = ce.cid AND c.ccid = cc.ccid GROUP BY c.`cid`")
@SelectProvider(type = CommodityProvider.class,method = "query")
    List<Commodity> queryCOmmodityList(Commodity commodity);
}
