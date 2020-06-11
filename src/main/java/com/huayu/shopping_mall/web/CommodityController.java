package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.service.ICommodityService;
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
@RequestMapping("/shopping_mall/commodity")
public class CommodityController {

    @Autowired
    ICommodityService iCommodityService;

@RequestMapping("/queryList")
    public List<Commodity> queryList(Commodity commodity){
    System.out.println(iCommodityService.queryCOmmodityList(commodity));
        return iCommodityService.queryCOmmodityList(commodity);
    }

    @RequestMapping("/queryListCommodtiy")
    public List<Commodity> queryListCommodtiy(){

        return iCommodityService.queryListCommodtiy();
    }

    @RequestMapping("/updatestate")
    public Integer updatestate(Commodity commodity){
        iCommodityService.updateById(commodity);
    return 200;
    }

    @RequestMapping("/queryById")
    public Commodity queryById(Integer cid){
    return iCommodityService.getById(cid);
    }



}
