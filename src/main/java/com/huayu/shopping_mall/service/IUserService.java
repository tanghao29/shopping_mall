package com.huayu.shopping_mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.shopping_mall.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public interface IUserService extends IService<User> {

    /**
     * 获取全部用户信息，包括角色，权限
     */

    User findAllUserInfoByUsername(String uname);



}
