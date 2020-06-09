package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.Specification;
import com.huayu.shopping_mall.service.ISpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@RestController
@RequestMapping("/shopping_mall/specification")
public class SpecificationController {

    @Autowired
    private ISpecificationService iSpecificationService;

    @RequestMapping("/querySpecifcationList")
    public List<Specification> querySpecifcationList(){
        return iSpecificationService.listSpcification();
    }

    @RequestMapping("/deleteById")
    public Integer deleteById(Integer sid){
            iSpecificationService.deleteById(sid);
        return  200;
    }

}
