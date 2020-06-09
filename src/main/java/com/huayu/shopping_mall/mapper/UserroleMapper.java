package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.Userrole;
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
public interface UserroleMapper extends BaseMapper<Userrole> {

    @Delete("delete from userrole where uid=#{value}")
    public void removeByUid(Integer uid);

    @Select("select * from userrole where uid=#{value}")
    public List<Userrole> queryuserrole(Integer uid);
}
