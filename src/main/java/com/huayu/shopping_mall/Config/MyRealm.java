package com.huayu.shopping_mall.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huayu.shopping_mall.entity.*;
import com.huayu.shopping_mall.service.*;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IRoleService iRoleService;

    @Autowired
    private IUserroleService iUserroleService;

    @Autowired
    private IRoleauthorityService iRoleauthorityService;

    @Autowired
    private IJurisdictionService iJurisdictionService;

    @Autowired
    private IUserjurisdictionService iUserjurisdictionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //1.先拿到用户名
        Object object = principalCollection.getPrimaryPrincipal();
        //2.根据用户查询数据库得到角色和权限

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uname", object.toString());
        User user = iUserService.getOne(queryWrapper);
        if (StringUtils.isEmpty(user)) {
            return null;
        }
        List<String> roles = null;
        QueryWrapper<Userrole> userroleQueryWrapper = new QueryWrapper<>();
        userroleQueryWrapper.eq("uid", user.getUid());
        List<Userrole> userroleList = iUserroleService.list(userroleQueryWrapper);

        roles.add("admin");
        for (Userrole userrole : userroleList) {
            QueryWrapper<Role> roleQueryWrapper = new QueryWrapper<>();
            roleQueryWrapper.eq("rid", userrole.getRid());
            List<Role> roleList = iRoleService.list(roleQueryWrapper);
            for (Role role : roleList) {
                QueryWrapper<Roleauthority> roleauthorityQueryWrapper = new QueryWrapper<>();
                roleauthorityQueryWrapper.eq("rid", role.getRid());
                List<Roleauthority> roleauthorityList = iRoleauthorityService.list(roleauthorityQueryWrapper);
                for (Roleauthority roleauthority : roleauthorityList) {
                    QueryWrapper<Jurisdiction> jurisdictionQueryWrapper = new QueryWrapper<>();
                    jurisdictionQueryWrapper.eq("jid", roleauthority.getJid());
                    List<Jurisdiction> jurisdictionList = iJurisdictionService.list(jurisdictionQueryWrapper);
                    for (Jurisdiction jurisdiction : jurisdictionList) {
                        roles.add(jurisdiction.getJpath());
                        QueryWrapper<Jurisdiction> jurisdictionQueryWrapper2 = new QueryWrapper<>();
                        jurisdictionQueryWrapper2.eq("jsuperior", jurisdiction.getJid());
                        List<Jurisdiction> jurisdictionList2 = iJurisdictionService.list(jurisdictionQueryWrapper2);
                        for (Jurisdiction jurisdiction2 : jurisdictionList2) {
                            roles.add(jurisdiction2.getJpath());
                        }

                    }
                }

            }

        }

        QueryWrapper<Userjurisdiction> userjurisdictionQueryWrapper = new QueryWrapper<>();
        userjurisdictionQueryWrapper.eq("uid", user.getUid());
        List<Userjurisdiction> userjurisdictionList = iUserjurisdictionService.list(userjurisdictionQueryWrapper);
        for (Userjurisdiction userjurisdiction : userjurisdictionList) {
            QueryWrapper<Jurisdiction> jurisdictionQueryWrapper = new QueryWrapper<>();
            jurisdictionQueryWrapper.eq("jid", userjurisdiction.getJid());
            List<Jurisdiction> jurisdictionList = iJurisdictionService.list(jurisdictionQueryWrapper);
            for (Jurisdiction jurisdiction : jurisdictionList) {
                roles.add(jurisdiction.getJpath());
                QueryWrapper<Jurisdiction> jurisdictionQueryWrapper2 = new QueryWrapper<>();
                jurisdictionQueryWrapper2.eq("jsuperior", jurisdiction.getJid());
                List<Jurisdiction> jurisdictionList2 = iJurisdictionService.list(jurisdictionQueryWrapper2);
                for (Jurisdiction jurisdiction2 : jurisdictionList2) {
                    roles.add(jurisdiction2.getJpath());
                }

            }

        }

        //3.返回授权的信息类
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        authorizationInfo.addStringPermissions(roles);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)authenticationToken;

        System.out.println( usernamePasswordToken.getUsername() + "username*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uname", usernamePasswordToken.getUsername());
        User user = null;
        user = iUserService.getOne(queryWrapper);
        if (StringUtils.isEmpty(user)) {
            return null;
        }
        Set<String> roles = new HashSet<>();
        QueryWrapper<Userrole> userroleQueryWrapper = new QueryWrapper<>();
        userroleQueryWrapper.eq("uid", user.getUid());
        List<Userrole> userroleList = iUserroleService.list(userroleQueryWrapper);

     roles.add("admin");
        for (Userrole userrole : userroleList) {
            QueryWrapper<Role> roleQueryWrapper = new QueryWrapper<>();
            roleQueryWrapper.eq("rid", userrole.getRid());
            List<Role> roleList = iRoleService.list(roleQueryWrapper);
            for (Role role : roleList) {
                QueryWrapper<Roleauthority> roleauthorityQueryWrapper = new QueryWrapper<>();
                roleauthorityQueryWrapper.eq("rid", role.getRid());
                List<Roleauthority> roleauthorityList = iRoleauthorityService.list(roleauthorityQueryWrapper);
                for (Roleauthority roleauthority : roleauthorityList) {
                    QueryWrapper<Jurisdiction> jurisdictionQueryWrapper = new QueryWrapper<>();
                    jurisdictionQueryWrapper.eq("jid", roleauthority.getJid());
                    List<Jurisdiction> jurisdictionList = iJurisdictionService.list(jurisdictionQueryWrapper);
                    for (Jurisdiction jurisdiction : jurisdictionList) {
                        roles.add(jurisdiction.getJpath());
                        QueryWrapper<Jurisdiction> jurisdictionQueryWrapper2 = new QueryWrapper<>();
                        jurisdictionQueryWrapper2.eq("jsuperior", jurisdiction.getJid());
                        List<Jurisdiction> jurisdictionList2 = iJurisdictionService.list(jurisdictionQueryWrapper2);
                        for (Jurisdiction jurisdiction2 : jurisdictionList2) {
                            roles.add(jurisdiction2.getJpath());
                        }

                    }
                }

            }

        }

        QueryWrapper<Userjurisdiction> userjurisdictionQueryWrapper = new QueryWrapper<>();
        userjurisdictionQueryWrapper.eq("uid", user.getUid());
        List<Userjurisdiction> userjurisdictionList = iUserjurisdictionService.list(userjurisdictionQueryWrapper);
        for (Userjurisdiction userjurisdiction : userjurisdictionList) {
            QueryWrapper<Jurisdiction> jurisdictionQueryWrapper = new QueryWrapper<>();
            jurisdictionQueryWrapper.eq("jid", userjurisdiction.getJid());
            List<Jurisdiction> jurisdictionList = iJurisdictionService.list(jurisdictionQueryWrapper);
            for (Jurisdiction jurisdiction : jurisdictionList) {
                roles.add(jurisdiction.getJpath());
                QueryWrapper<Jurisdiction> jurisdictionQueryWrapper2 = new QueryWrapper<>();
                jurisdictionQueryWrapper2.eq("jsuperior", jurisdiction.getJid());
                List<Jurisdiction> jurisdictionList2 = iJurisdictionService.list(jurisdictionQueryWrapper2);
                for (Jurisdiction jurisdiction2 : jurisdictionList2) {
                    roles.add(jurisdiction2.getJpath());
                }

            }

        }

        user.setRoles(roles);
//

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user, usernamePasswordToken.getPassword(), getName());
        redisTemplate.opsForValue().set("users",user);
        return simpleAuthenticationInfo;

    }
}
