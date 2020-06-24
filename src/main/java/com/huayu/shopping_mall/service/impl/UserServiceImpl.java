package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.User;
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


    @Override
    public User findAllUserInfoByUsername(String uname) {
        System.out.println("123456789999999999999999999999");
        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        userQueryWrapper.eq("uname",uname);
        User user = userMapper.selectOne(userQueryWrapper);
//       userMapper.getName(uname);
        System.out.println(user.toString()+"/******/*/*/*/*/*/*/*/*");



        // 用户的角色集合
        List<Role> roleList = roleMapper.findRoleListByUserId(user.getUid());
        // 用户的权限集合
        List<Jurisdiction> permissionList = jurisdictionMapper.findPermissionByUserId(user.getUid());

        user.setRoleList(roleList);
        user.setPermissionList(permissionList);

        return user;
    }



    public void updateUserStatu(int uid, String ustate){
        userMapper.updateuserstatu(uid,ustate);
    }

    public List<User> searchUser(User user){
        return userMapper.searchUser(user);
    }

}
