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
    public Integer searchbrowse(String nb){
        return browseService.searchbrowse(nb);
    }

    //下单人数
    @GetMapping("/ordersCount")
    @ResponseBody
    public Integer ordersCount(String nb){
        return browseService.ordersCount(nb);
    }

    //订单数
    @GetMapping("/ordersCounts")
    @ResponseBody
    public Integer ordersCounts(String nb){
        return browseService.ordersCounts(nb);
    }

    //下单件数
    @GetMapping("/sumofnumber")
    @ResponseBody
    public Integer sumofnumber(String nb){
        return browseService.sumofnumber(nb);
    }

}
