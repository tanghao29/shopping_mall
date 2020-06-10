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
    public List<Commodity> queryList(){
    System.out.println(iCommodityService.queryCOmmodityList());
        return iCommodityService.queryCOmmodityList();
    }

    @RequestMapping("/queryListCommodtiy")
    public List<Commodity> queryListCommodtiy(){

        return iCommodityService.queryListCommodtiy();
    }



}
