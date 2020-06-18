package com.huayu.shopping_mall.realm;


import com.huayu.shopping_mall.entity.Jurisdiction;
import com.huayu.shopping_mall.entity.Role;
import com.huayu.shopping_mall.entity.User;
import com.huayu.shopping_mall.service.IUserService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理登录和授权逻辑
 *
 * @author licheng
 * @date 2020/6/13 17:57
 */
@Slf4j
public class CustomRealm extends AuthorizingRealm {


    @Autowired
    IUserService userService;

    /**
     * 授权  进行权限校验的时候会调用
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("授权--------");
        User newUser = (User) principalCollection.getPrimaryPrincipal();

        User user = userService.findAllUserInfoByUsername(newUser.getUname());

        List<String> stringRoleList = new ArrayList<>();
        List<String> stringPermissionList = new ArrayList<>();

        List<Role> roleList = user.getRoleList();

        for (Role role : roleList) {
            stringRoleList.add(role.getRname());

            List<Jurisdiction> permissionList = user.getPermissionList();

            for (Jurisdiction p : permissionList) {
                if (p != null) {
                    stringPermissionList.add(p.getJname());
                }
            }
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(stringRoleList);
        info.addStringPermissions(stringPermissionList);

        return info;
//        return new SimpleAuthorizationInfo();
    }

    /**
     * 认证  用户登录的时候会调用
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("------认证-------");

        // 从token中获取用户信息，token代表用户输入
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String uname = usernamePasswordToken.getUsername();
        User user = userService.findAllUserInfoByUsername(uname);

        // 取密码
        String pwd = user.getUpass();
        if (pwd == null || "".equals(pwd)) {
            return null;
        }

        /**
         * 这里用了redis后，第一个参数不能传username，的传user对象，他自己去获取唯一的key也就是id，去做缓存的key
         */
        return new SimpleAuthenticationInfo(user.getUid(), user.getUpass(), this.getName());
    }
}
