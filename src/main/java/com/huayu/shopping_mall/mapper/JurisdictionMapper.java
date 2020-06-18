package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Jurisdiction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
public interface JurisdictionMapper extends BaseMapper<Jurisdiction> {


    /**
     * 根据用户id查询权限集合
     * @param uid
     * @return
     */
    List<Jurisdiction> findPermissionByUserId(Integer uid);
}
