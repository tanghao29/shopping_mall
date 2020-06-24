package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.User;
import com.huayu.shopping_mall.mapper.JurisdictionMapper;
import com.huayu.shopping_mall.mapper.RoleMapper;
import com.huayu.shopping_mall.mapper.UserMapper;
import com.huayu.shopping_mall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    JurisdictionMapper jurisdictionMapper;






    public void updateUserStatu(int uid, String ustate){
        userMapper.updateuserstatu(uid,ustate);
    }

    public List<User> searchUser(User user){
        return userMapper.searchUser(user);
    }

}
