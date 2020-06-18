package com.huayu.shopping_mall.web;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.service.ICommodityService;
import com.huayu.shopping_mall.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.interfaces.PBEKey;
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
    public List<Commodity> queryList(Commodity commodity){
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

    @RequestMapping("/updatecshenhe")
    public Integer updatecshenhe(Commodity commodity){

        commodityService.updateById(commodity);
        return 200;
    }

    @RequestMapping("/queryweishnhe")
    public Integer queryweishnhe(){
        QueryWrapper<Commodity> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cshenhe","未审核");
        return commodityService.list(queryWrapper).size();
    }


    @RequestMapping("/queryweitongguo")
    public Integer queryweitongguo(){
        QueryWrapper<Commodity> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cshenhe","未通过");
        return commodityService.list(queryWrapper).size();
    }

    @RequestMapping("/queryyitongguo")
    public Integer queryyitongguo(){
        QueryWrapper<Commodity> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cshenhe","已审核");
        return commodityService.list(queryWrapper).size();
    }
}
