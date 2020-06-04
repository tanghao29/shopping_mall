package com.huayu.shopping_mall.service.impl;

import com.huayu.shopping_mall.entity.User;
import com.huayu.shopping_mall.mapper.UserMapper;
import com.huayu.shopping_mall.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
