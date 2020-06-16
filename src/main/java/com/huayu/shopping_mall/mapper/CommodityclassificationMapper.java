package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.CommodityClassificationData;
import com.huayu.shopping_mall.entity.Commodityclassification;
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
public interface CommodityclassificationMapper extends BaseMapper<Commodityclassification> {

    //查询卖出去的商品分类
    @Select(" select ccname from  commodityclassification where ccid in(select  ccid from commodity where cid in (select cid from orderform where ofstate!=-1 group by cid) group by ccid)  ")
    List<String> commodityClassification();

    //查询卖出去的商品类别和件数
    @Select("select  sum(o.ofnumber) value ,com.ccname name  from  commodityclassification com ,commodity c,orderform o where com.ccid=c.ccid and c.cid=o.cid and o.ofstate!=-1 group by com.ccid ")
    List<CommodityClassificationData> commodityClassificationdata();

    //查询卖出去的商品类别和件数
    @Select(" select  sum(o.ofmoney) value ,com.ccname  name  from  commodityclassification com ,commodity c,orderform o where com.ccid=c.ccid and c.cid=o.cid and o.ofstate!=-1 group by com.ccid ")
    List<CommodityClassificationData> commodityClassificationmoney();



}