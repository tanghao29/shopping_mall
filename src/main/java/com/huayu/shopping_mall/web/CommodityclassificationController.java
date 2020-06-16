package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.CommodityClassificationData;
import com.huayu.shopping_mall.entity.Commodityclassification;
import com.huayu.shopping_mall.service.ICommodityclassificationService;
import com.huayu.shopping_mall.service.impl.CommodityclassificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Controller
@RequestMapping("/shopping_mall/commodityclassification")
public class CommodityclassificationController {

    @Autowired
    ICommodityclassificationService iCommodityclassificationService;

    @Autowired
    CommodityclassificationServiceImpl commodityclassificationService;

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

    @GetMapping("/commodityClassification")
    @ResponseBody
    public List<String> commodityClassification(){
        return commodityclassificationService.commodityClassification();
    }

    @GetMapping("/commodityClassificationData")
    @ResponseBody
    public List<CommodityClassificationData> commodityClassificationData(){

        return commodityclassificationService.commodityClassificationData();
    }

    @GetMapping("/commodityClassificationmoney")
    @ResponseBody
    public List<CommodityClassificationData> commodityClassificationmoney(){

        return commodityclassificationService.commodityClassificationmoney();
    }


}
