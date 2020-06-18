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


    /*
    * 折线统计
    * 付款金额
    * */
    @GetMapping("/zxPaymentOfnumber")
    @ResponseBody
    public Integer[] zxPaymentOfnumber(Integer start,Integer flag){
        Integer [] in=new Integer[start-flag];
        for (Integer i = flag; i < start; i++) {
             System.out.println(start-i-1);
             in[start-i-1]=browseService.zxPaymentOfnumber(i+1);
        }
        return in;
    }


    /*
     * 折线统计
     * 付款金额
     * */
    @GetMapping("/zxRefundMoney")
    @ResponseBody
    public Integer[] zxRefundMoney(Integer start,Integer flag){
        Integer [] in=new Integer[start-flag];
        for (Integer i = flag; i < start; i++) {
            System.out.println(start-i-1);
            in[start-i-1]=browseService.zxRefundMoney(i+1);
        }
        return in;
    }

    /*
     * 折线统计
     * 付款人数
     * */
    @GetMapping("/zxPaymentCount")
    @ResponseBody
    public Integer[] zxPaymentCount(Integer start,Integer flag){
        Integer [] in=new Integer[start-flag];
        for (Integer i = flag; i < start; i++) {
            System.out.println(start-i-1);
            in[start-i-1]=browseService.zxPaymentCount(i+1);
        }
        return in;
    }

    /*
     * 折线统计
     * 付款件数
     * */
    @GetMapping("/zxPaymentOfnumberUser")
    @ResponseBody
    public Integer[] zxPaymentOfnumberUser(Integer start,Integer flag){
        Integer [] in=new Integer[start-flag];
        for (Integer i = flag; i < start; i++) {
            System.out.println(start-i-1);
            in[start-i-1]=browseService.zxPaymentOfnumberUser(i+1);
        }
        return in;
    }

    /*
     * 折线统计
     * 下单转化率  下单人数/浏览人数 * %100
     * */
    @GetMapping("/zxOrderPercentConversion")
    @ResponseBody
    public Integer[] zxOrderPercentConversion(Integer start,Integer flag){
        Integer [] in=new Integer[start-flag];
        for (Integer i = flag; i < start; i++) {
            try {
                in[start-i-1]=(browseService.zxOrdersCount(i+1) / browseService.zxSearchbrowse(i+1)) * 100;
            } catch (Exception e) {
                in[start-i-1]=0;
            }
        }
        return in;
    }
    /*
     * 折线统计
     * 付款转化率  付款人数/下单人数 * %100
     * */
    @GetMapping("/zxPaymentPercentConversion")
    @ResponseBody
    public Integer[] zxPaymentPercentConversion(Integer start,Integer flag){
        Integer [] in=new Integer[start-flag];
        for (Integer i = flag; i < start; i++) {
            try {
                in[start-i-1]=(browseService.zxPaymentCountXuid(i+1) / browseService.zxOrdersCount(i+1)) * 100;
            } catch (Exception e) {
                in[start-i-1]=0;
            }
        }
        return in;
    }
    /*
     * 折线统计
     * 付款转化率  付款人数/下单人数 * %100
     * */
    @GetMapping("/zxMakePercentConversion")
    @ResponseBody
    public Integer[] zxMakePercentConversion(Integer start,Integer flag){
        Integer [] in=new Integer[start-flag];
        for (Integer i = flag; i < start; i++) {
            try {
                in[start-i-1]=(browseService.zxPaymentCountXuid(i+1) / browseService.zxSearchbrowse(i+1)) * 100;
            } catch (Exception e) {
                in[start-i-1]=0;
            }
        }
        return in;
    }

    /*
    * 柱状图
    * 某个价钱段的订单数
    * */
    @GetMapping("/mqHistogramcolumn")
    @ResponseBody
    public Integer[] mqHistogramcolumn(String starttime,String endtime){
        Integer [] in=new Integer[8];
        in[0]=browseService.mqHistogramcolumn(starttime,endtime,0,50);
        in[1]=browseService.mqHistogramcolumn(starttime,endtime,51,100);
        in[2]=browseService.mqHistogramcolumn(starttime,endtime,101,200);
        in[3]=browseService.mqHistogramcolumn(starttime,endtime,201,500);
        in[4]=browseService.mqHistogramcolumn(starttime,endtime,501,1000);
        in[5]=browseService.mqHistogramcolumn(starttime,endtime,1001,5000);
        in[6]=browseService.mqHistogramcolumn(starttime,endtime,5001,10000);
        in[7]=browseService.mqHistogramcolumn(starttime,endtime,10000,0);

        return in;
    }

}
