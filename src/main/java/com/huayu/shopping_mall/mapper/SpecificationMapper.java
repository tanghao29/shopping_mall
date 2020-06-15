package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Specification;
import com.huayu.shopping_mall.mapper.Provider.specificationProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

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
public interface SpecificationMapper extends BaseMapper<Specification> {

//    @Select("select * from specification s inner join commodityclassification c on s.ccid=c.ccid")
    @SelectProvider(type = specificationProvider.class ,method = "query")
    List<Specification> listSpcification(Integer ccid);

}
