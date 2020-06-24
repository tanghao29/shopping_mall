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
    public List<Specification> querySpecifcationList(Integer ccid){
        return iSpecificationService.listSpcification(ccid);
    }

    @RequestMapping(value = "/deleteById")
    public Integer deleteById(Integer sid){
        iSpecificationService.removeById(sid);
        return  200;
    }

    @RequestMapping("/queryById")
    public Specification queryById(Integer sid){
        return iSpecificationService.getById(sid);
    }

    @RequestMapping("/update")
    public Integer update(Specification specification){
        iSpecificationService.updateById(specification);
        return 200;
    }

    @RequestMapping("/addspec")
    public Integer addspec(Specification specification){
        iSpecificationService.save(specification);
        return 200;
    }

    @RequestMapping("/deleteByccid")
    public Integer deleteByccid(Integer sid){
        Specification specification=new Specification();
        specification.setSid(sid);
        specification.setCcid(0);
        iSpecificationService.updateById(specification);

        return 200;
    }

}
