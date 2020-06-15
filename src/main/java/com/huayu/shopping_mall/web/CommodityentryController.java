package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Commodityentry;
import com.huayu.shopping_mall.service.ICommodityentryService;
import com.huayu.shopping_mall.service.impl.CommodityentryServiceImpl;
import com.huayu.shopping_mall.utils.RespBean;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@RestController
@RequestMapping("/shopping_mall/commodityentry")
public class CommodityentryController {

    @Autowired
    CommodityentryServiceImpl goodsInService;

    @Autowired
    ICommodityentryService iCommodityentryService;

    /**
     * 分页查询入库列表
     *
     * @param page
     * @param size
     * @param commodityentry
     * @param beginDate
     * @return
     */
    @GetMapping("/")
    public RespPageBean queryAllCommodityentry(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Commodityentry commodityentry, Date[] beginDate, String uname) {
        return this.goodsInService.getAllGoodInByPage(page, size, commodityentry, beginDate, uname);
    }

    @PostMapping("/")
    public RespBean addGoods(@RequestBody Commodityentry commodityentry) {
        if (goodsInService.addGoods(commodityentry) == 1) {
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @GetMapping("/queryCommodityentryList")
    public List<Commodityentry> queryCommodityentryList(Integer cid){

        return iCommodityentryService.queryCommodityentryList(cid);
    }

    @RequestMapping("/queryById")
    public Commodityentry queryById(Integer ceid){

        return iCommodityentryService.getById(ceid);
    }



}
