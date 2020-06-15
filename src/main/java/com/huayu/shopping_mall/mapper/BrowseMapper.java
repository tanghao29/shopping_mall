package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.dynamic.Searchbrowse;
import com.huayu.shopping_mall.entity.Browse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mq
 * @since 2020-06-11
 */

@Mapper
public interface BrowseMapper extends BaseMapper<Browse> {

    @SelectProvider(type = Searchbrowse.class,method = "searchbrowse")
    Integer searchbrowse(String nb);

    @SelectProvider(type = Searchbrowse.class,method = "ordersCount")
    Integer ordersCount(String nb);

    //订单数
    @SelectProvider(type = Searchbrowse.class,method = "ordersCounts")
    Integer ordersCounts(String nb);

    //下单件数
    @SelectProvider(type = Searchbrowse.class,method = "sumofnumber")
    Integer sumofnumber(String nb);
}
