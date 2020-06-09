package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Roleauthority;
import org.apache.ibatis.annotations.Delete;
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
public interface RoleauthorityMapper extends BaseMapper<Roleauthority> {

    @Delete("delete from roleauthority where rid=#{value}")
    public void deleteByRid(Integer rid);

    @Select("select * from  roleauthority where rid=#{value}")
    public List<Roleauthority> queryRoleauthorityById(Integer rid);
}
