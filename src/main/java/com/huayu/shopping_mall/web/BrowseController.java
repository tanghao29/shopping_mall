package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.service.impl.BrowseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-11
 */
@RestController
@RequestMapping("/abc/browse")
public class BrowseController {

    @Autowired
    BrowseServiceImpl browseService;


    //浏览人数
    @GetMapping("/searchbrowse")
    @ResponseBody
    public Integer searchbrowse(String nb,String time){
        Integer in=0;
        if(null!=browseService.searchbrowse(nb,time)){
            in=browseService.searchbrowse(nb,time);
        }
        return in;
    }

    //下单人数
    @GetMapping("/ordersCount")
    @ResponseBody
    public Integer ordersCount(String nb,String time){
        Integer in=0;
        if(null!=browseService.ordersCount(nb,time)){
            in=browseService.ordersCount(nb,time);
        }
        return in;
    }

    //订单数
    @GetMapping("/ordersCounts")
    @ResponseBody
    public Integer ordersCounts(String nb,String time){
        Integer in=0;
        if(null!=browseService.ordersCounts(nb,time)){
            in=browseService.ordersCounts(nb,time);
        }
        return in;
    }

    //下单件数
    @GetMapping("/sumofnumber")
    @ResponseBody
    public Integer sumofnumber(String nb,String time){
        Integer in=0;
        if(null!=browseService.sumofnumber(nb,time)){
            in=browseService.sumofnumber(nb,time);
        }
        return in;
    }


    //下单件数
    @GetMapping("/yxordersCounts")
    @ResponseBody
    public Integer yxordersCounts(String nb,String time){
        Integer in=0;
        if(null!=browseService.yxordersCounts(nb,time)){
            in=browseService.yxordersCounts(nb,time);
        }
        return browseService.yxordersCounts(nb,time);
    }

    //下单金额
    @GetMapping("/ordersMontey")
    @ResponseBody
    public Integer ordersMontey(String nb,String time){
        Integer in=0;
        if(null!=browseService.ordersMontey(nb,time)){
            in=browseService.ordersMontey(nb,time);
        }
        return in;
    }

    //退款金额
    @GetMapping("/refundMoney")
    @ResponseBody
    public Integer refundMoney(String nb,String time){
        Integer in=0;
        if(null!=browseService.refundMoney(nb,time)){
            in=browseService.refundMoney(nb,time);
        }
        return in;
    }
    //付款人数
    @GetMapping("/paymentCount")
    @ResponseBody
    public Integer paymentCount(String nb,String time){
        return browseService.paymentCount(nb,time);
    }


    //付款订单数
    @GetMapping("/paymentOrderCount")
    @ResponseBody
    public Integer paymentOrderCount(String nb,String time){
        return browseService.paymentOrderCount(nb,time);
    }


    //付款件数
    @GetMapping("/paymentOfnumber")
    @ResponseBody
    public Integer paymentOfnumber(String nb,String time){
        return browseService.paymentOfnumber(nb,time);
    }


    //付款金额
    @GetMapping("/paymentOfmoney")
    @ResponseBody
    public Integer paymentOfmoney(String nb,String time){
        return browseService.paymentOfmoney(nb,time);
    }



}
