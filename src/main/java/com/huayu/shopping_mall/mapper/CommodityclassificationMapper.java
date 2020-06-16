package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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




}
