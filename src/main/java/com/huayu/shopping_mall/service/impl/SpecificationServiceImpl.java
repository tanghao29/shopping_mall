package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Specification;
import com.huayu.shopping_mall.mapper.SpecificationMapper;
import com.huayu.shopping_mall.service.ISpecificationService;
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
public class SpecificationServiceImpl extends ServiceImpl<SpecificationMapper, Specification> implements ISpecificationService {

    @Autowired
    SpecificationMapper specificationMapper;

    @Override
    public List<Specification> listSpcification(Integer ccid) {
        return specificationMapper.listSpcification(ccid);
    }



}
