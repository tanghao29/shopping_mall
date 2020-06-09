package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Commodityclassification;
import com.huayu.shopping_mall.service.ICommodityclassificationService;
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
@RequestMapping("/shopping_mall/commodityclassification")
public class CommodityclassificationController {

    @Autowired
    ICommodityclassificationService iCommodityclassificationService;

    @RequestMapping("/queryCcList")
    public List<Commodityclassification> queryCcList(){
        return iCommodityclassificationService.list(null);
    }

    @RequestMapping("/deleteCcById")
    public Integer deleteCcById(Integer ccid){
        iCommodityclassificationService.removeById(ccid);
return 200;
    }

    @RequestMapping("/addCc")
    public Integer addCc(Commodityclassification commodityclassification){
        iCommodityclassificationService.save(commodityclassification);
        return 200;
    }

    @RequestMapping("/queryCommodityById")
    public Commodityclassification queryCommodityById(Integer ccid){
        return iCommodityclassificationService.getById(ccid);
    }

    @RequestMapping("/updatecommodtiy")
    public Integer updatecommodtiy(Commodityclassification commodityclassification){


        iCommodityclassificationService.saveOrUpdate(commodityclassification);
        return 200;
    }

}
