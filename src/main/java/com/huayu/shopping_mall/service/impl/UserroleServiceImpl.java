package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Userrole;
import com.huayu.shopping_mall.mapper.UserroleMapper;
import com.huayu.shopping_mall.service.IUserroleService;
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
public class UserroleServiceImpl extends ServiceImpl<UserroleMapper, Userrole> implements IUserroleService {

    @Autowired
    UserroleMapper userroleMapper;

    public void removeByUid(Integer uid){
        userroleMapper.removeByUid(uid);
    }

    public List<Userrole> queryUserRole(Integer uid){
     return  userroleMapper.queryuserrole(uid);
    }
}
