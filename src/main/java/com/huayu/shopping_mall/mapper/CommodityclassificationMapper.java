package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.dynamic.SearchCommodityclassification;
import com.huayu.shopping_mall.entity.CommodityClassificationData;
import com.huayu.shopping_mall.entity.Commodityclassification;
import com.huayu.shopping_mall.entity.Commoditystatistics;
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
public interface CommodityclassificationMapper extends BaseMapper<Commodityclassification> {

    //查询卖出去的商品分类
    @SelectProvider(type = SearchCommodityclassification.class,method = "commodityClassification")
    List<String> commodityClassification(String time);

    //查询卖出去的商品类别和件数

    @SelectProvider(type = SearchCommodityclassification.class,method = "commodityClassificationdata")
    List<CommodityClassificationData> commodityClassificationdata(String time);

    //查询卖出去的商品类别和件数
    @SelectProvider(type = SearchCommodityclassification.class,method = "commodityClassificationmoney")
    List<CommodityClassificationData> commodityClassificationmoney(String time);

    @SelectProvider(type = SearchCommodityclassification.class,method = "commoditystatistics")
    List<Commoditystatistics> commoditystatistics(String time);


    @Select("select ccname from  commodityclassification ")
    List<String> category();

    @SelectProvider(type = SearchCommodityclassification.class,method = "categoryData")
    Integer categoryData(Integer time,String ccname);

    @Select("select  count(c.cid) value , com.ccname  name from commodityclassification com left join commodity c on com.ccid=c.ccid group by com.ccid ")
    public List<CommodityClassificationData> countliebie();

}