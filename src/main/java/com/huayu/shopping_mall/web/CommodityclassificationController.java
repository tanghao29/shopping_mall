package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.*;
import com.huayu.shopping_mall.service.ICommodityclassificationService;
import com.huayu.shopping_mall.service.impl.CommodityclassificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

    /*x*/
    @GetMapping("/commodityClassification")
    @ResponseBody
    public List<String> commodityClassification(String time){
        return commodityclassificationService.commodityClassification(time);
    }

    @GetMapping("/commodityClassificationData")
    @ResponseBody
    public List<CommodityClassificationData> commodityClassificationData(String time){

        return commodityclassificationService.commodityClassificationData(time);
    }

    @GetMapping("/commodityClassificationmoney")
    @ResponseBody
    public List<CommodityClassificationData> commodityClassificationmoney(String time){

        return commodityclassificationService.commodityClassificationmoney(time);
    }

    @GetMapping("/commodityClassificationtable")
    @ResponseBody
    public List<CommodityClassificationtabledata> commodityClassificationtable(String time){
        List<CommodityClassificationtabledata> list=new ArrayList<>();

        List<CommodityClassificationData> count=commodityclassificationService.commodityClassificationData(time);
        List<CommodityClassificationData> money=commodityclassificationService.commodityClassificationmoney(time);


        Integer maxcount=0;
        for (int i = 0; i < count.size(); i++) {
            maxcount+=count.get(i).getValue();
        }
        System.out.println("maxcount====================>:"+maxcount);
        Integer maxmoney=0;
        for (int i = 0; i < money.size(); i++) {
            maxmoney+=money.get(i).getValue();
        }

        for (int i = 0; i < count.size(); i++) {
            CommodityClassificationtabledata commodityClassificationtabledata=new CommodityClassificationtabledata();
            commodityClassificationtabledata.setClassname(count.get(i).getName());
            commodityClassificationtabledata.setSellcount(count.get(i).getValue());
            float nb=(float)count.get(i).getValue() / maxcount;
            commodityClassificationtabledata.setCountproportion(nb * 100+"%");
            commodityClassificationtabledata.setSellmoney(money.get(i).getValue());
            float mq=(float)money.get(i).getValue() / maxmoney;
            commodityClassificationtabledata.setMoneyproportion(mq * 100+"%");
            list.add(commodityClassificationtabledata);
        }

        return list;
    }

    @GetMapping("/commoditystatistics")
    @ResponseBody
    public List<Commoditystatistics> commoditystatistics(String time){
        return commodityclassificationService.commoditystatistics(time);
    }


    @GetMapping("/barchart")
    @ResponseBody
    public List<Series> barchart(){
        List<Series> res=new ArrayList<>();
        List<String> list=commodityclassificationService.category();
        for (int i = 0; i < list.size(); i++) {
            Series series=new Series();
            series.setName(list.get(i));
            series.setType("bar");
            series.setStack("vistors");
            series.setBarWidth("60%");
            series.setData(commodityclassificationService.categoryData(7,list.get(i)));
            res.add(series);
        }
        return res;
    }

}
