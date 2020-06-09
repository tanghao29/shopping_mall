package com.huayu.shopping_mall.service.impl;
import com.huayu.shopping_mall.entity.Roleauthority;
import com.huayu.shopping_mall.mapper.RoleauthorityMapper;
import com.huayu.shopping_mall.service.IRoleauthorityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class RoleauthorityServiceImpl extends ServiceImpl<RoleauthorityMapper, Roleauthority> implements IRoleauthorityService {

    @Autowired
    RoleauthorityMapper roleauthorityMapper;

    public void deleteByRid(Integer rid){
        roleauthorityMapper.deleteByRid(rid);
    }


    public List<Roleauthority> queryRoleauthorityByid(Integer rid){
        return roleauthorityMapper.queryRoleauthorityById(rid);
    }
}
