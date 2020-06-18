package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.entity.Week;
import com.huayu.shopping_mall.entity.WeekMoney;
import com.huayu.shopping_mall.service.impl.OrderformServiceImpl;
import com.huayu.shopping_mall.utils.RespBean;
import com.huayu.shopping_mall.utils.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin
@RequestMapping("/shopping_mall/orderform")
public class OrderformController {

    @Autowired
    OrderformServiceImpl orderformService;

    /**
     * 分页查询订单列表
     * @param page
     * @param size
     * @param orderform
     * @param beginDate
     * @return
     */
    @GetMapping("/")
    public RespPageBean queryAllOrders(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,Orderform orderform,Date[] beginDate) {
        return orderformService.getOrderByPage(page,size,orderform,beginDate);
    }

    @RequestMapping("/querylsit")
    public List<Orderform> querylsit(){
        return orderformService.list();
    }

    @CrossOrigin
    @RequestMapping("/updateOrder")
    public RespBean updateOrder(Orderform orderform){
        System.out.println("进来了！！！！！！！！！！！！");
        if(orderformService.updateById(orderform) == true){
            return RespBean.ok("地址修改成功");
        }
        return RespBean.error("地址修改失败");
    }

    /*
    * mengqi
    * 查询当天的订单总数
    * */
    @GetMapping("/orderformcount")
    @ResponseBody
    public Integer orderformcount(){
        return orderformService.orderformcount();
    }

    /*
    * mengqi
    * 查询当天的销售总额
    * */
    @GetMapping("/totalsalescount")
    @ResponseBody
    public  Integer totalsalescount(){
        return orderformService.totalsalescount();
    }

    /*
     * mengqi
     * 查询当天的销售总额
     * */
    @GetMapping("/yesterdaytotalsalescount")
    @ResponseBody
    public  Integer yesterdaytotalsalescount(){
        return orderformService.yesterdaytotalsalescount();
    }

    /*
     * mengqi
     * 查询近7天的销售总额
     * */
    @GetMapping("/weekcount")
    @ResponseBody
    public  Integer weekcount(){
        return orderformService.weekcount();
    }

    /*
    * mengqi
    * 查询近7天的订单数量
    * */
    @GetMapping("/selectWeek")
    @ResponseBody
    public Integer[] selectWeek(){

        Week week=orderformService.selectWeek();
        Integer [] in=new Integer[7];
            in[0]=week.getDay7();
            in[1]=week.getDay6();
            in[2]=week.getDay5();
            in[3]=week.getDay4();
            in[4]=week.getDay3();
            in[5]=week.getDay2();
            in[6]=week.getDay1();
        System.out.println("======================----"+in.toString());
        return in;
    }


    /* mengqi
    * 查询近7天的上周的订单数量
    * */
    @GetMapping("/yesterWeek")
    @ResponseBody
    public Integer[] yesterWeek(){

        Week week=orderformService.yesterWeek();
        Integer [] in=new Integer[7];
        in[0]=week.getDay7();
        in[1]=week.getDay6();
        in[2]=week.getDay5();
        in[3]=week.getDay4();
        in[4]=week.getDay3();
        in[5]=week.getDay2();
        in[6]=week.getDay1();
        System.out.println("======================----"+in.toString());
        return in;
    }


    /*
     * mengqi
     * 查询近7天的销售数量
     * */
    @GetMapping("/selectWeekMoney")
    @ResponseBody
    public Double[] selectWeekMoney(){

        WeekMoney week=orderformService.selectWeekMoney();
        Double [] in=new Double[7];
        in[0]=week.getDay7();
        in[1]=week.getDay6();
        in[2]=week.getDay5();
        in[3]=week.getDay4();
        in[4]=week.getDay3();
        in[5]=week.getDay2();
        in[6]=week.getDay1();
        System.out.println("======================----"+in.toString());
        return in;
    }

    /*
     * mengqi
     * 查询上7天的销售数量
     * */
    @GetMapping("/yesterWeekMoney")
    @ResponseBody
    public Double[] yesterWeekMoney(){

        WeekMoney week=orderformService.yesterWeekMoney();
        Double [] in=new Double[7];
         if(null!=week){
            in[0]=week.getDay7();
            in[1]=week.getDay6();
            in[2]=week.getDay5();
            in[3]=week.getDay4();
            in[4]=week.getDay3();
            in[5]=week.getDay2();
            in[6]=week.getDay1();
        }else{
             for (int i = in.length - 1; i >= 0; i--) {
                  in[i]=0.00;
             }
         }

        return in;
    }

}
