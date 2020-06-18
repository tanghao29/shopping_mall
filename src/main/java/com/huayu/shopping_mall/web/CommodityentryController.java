package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Commodity;
import com.huayu.shopping_mall.entity.Commodityentry;
import com.huayu.shopping_mall.mapper.CommodityMapper;
import com.huayu.shopping_mall.service.ICommodityService;
import com.huayu.shopping_mall.service.ICommodityentryService;
import com.huayu.shopping_mall.service.impl.CommodityentryServiceImpl;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Autowired
    ICommodityService iCommodityService;

    @Autowired
    CommodityMapper commodityMapper;
    /**
     * 分页查询入库列表
     * @param page
     * @param size
     * @param commodityentry
     * @param beginDate
     * @return
     */
    @GetMapping("/")
    public RespPageBean queryAllCommodityentry(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, Commodityentry commodityentry, Date[] beginDate,String uname) {
        return this.goodsInService.getAllGoodInByPage(page,size,commodityentry,beginDate,uname);
    }

    @GetMapping("/queryCommodityentryList")
    public List<Commodityentry> queryCommodityentryList(Integer cid){

        return iCommodityentryService.queryCommodityentryList(cid);
    }

    @RequestMapping("/queryById")
    public Commodityentry queryById(Integer ceid){

        return iCommodityentryService.getById(ceid);
    }

    @CrossOrigin
    @RequestMapping("/save")
    public Integer save( Commodityentry commodityentry){
        if(commodityentry.getCid()!=null&&!commodityentry.getCid().equals("")){
            System.out.println(commodityentry.toString()+"*******************");
            Commodity commodity=new Commodity();
            commodity.setCname(commodityentry.getCname());
            commodity.setCcid(commodityentry.getCcid());
            commodityentry.setCid(commodityMapper.insertfanhuiid(commodity));
        }

        commodityentry.setCedate(new Date());
        iCommodityentryService.save(commodityentry);
        return 200;
    }

    @RequestMapping("/updatecenumber")
    public Integer updatecenumber(Commodityentry commodityentry){

        iCommodityentryService.updateById(commodityentry);
        return 200;
    }





}
