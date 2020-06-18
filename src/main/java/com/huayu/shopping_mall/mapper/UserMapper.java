package com.huayu.shopping_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.shopping_mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

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
public interface UserMapper extends BaseMapper<User> {

    @Update("update user set ustate=#{ustate} where uid=#{uid}")
     public void updateuserstatu(int uid,String ustate);

    @SelectProvider(type = com.huayu.shopping_mall.dynamic.User.class,method = "searchUser")
    public List<User> searchUser(User user);

    /**
     * 根据用户名查询用户
     * @param uname
     * @return
     */
    @Select("select * from user where uname=#{uname}")
    User getByUsername(String uname);

    /**
     * 只查询name
     * @param uname
     * @return
     */
    @Select("select * from user where uname=#{uname}")
    User getName(String uname);
}
