package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.service.ICommodityService;
import com.huayu.shopping_mall.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @Autowired
    CommodityServiceImpl commodityService;

@RequestMapping("/queryList")
    public List<Commodity> queryList(){
    System.out.println(iCommodityService.queryCOmmodityList());
        return iCommodityService.queryCOmmodityList();
    }

    @RequestMapping("/queryListCommodtiy")
    public List<Commodity> queryListCommodtiy(){

        return iCommodityService.queryListCommodtiy();
    }


    /*
    * 已下架
    * */
    @GetMapping("/sold")
    @ResponseBody
    public Integer sold(){
        return  commodityService.sold();
    }

    /*
    * 已上架
    * */
    @GetMapping("/putaway")
    @ResponseBody
    public Integer putaway(){
        return  commodityService.putaway();
    }

    /*
     * 库存紧张
     * */
    @GetMapping("/inventory")
    @ResponseBody
    public Integer inventory(){
        return  commodityService.inventory();
    }

    /*
     * 全部商品
     * */
    @GetMapping("/countCommodityentry")
    @ResponseBody
    public Integer countCommodityentry(){
        return  commodityService.countCommodityentry();
    }
}
