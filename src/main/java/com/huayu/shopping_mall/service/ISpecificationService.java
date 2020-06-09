package com.huayu.shopping_mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.shopping_mall.entity.Specification;
import com.baomidou.mybatisplus.service.IService;
import com.huayu.shopping_mall.entity.Specification;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public interface ISpecificationService extends IService<Specification> {

    List<Specification> listSpcification();

}
