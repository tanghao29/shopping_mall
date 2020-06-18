package com.huayu.shopping_mall.web;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huayu.shopping_mall.entity.Salesreturn;
import com.huayu.shopping_mall.service.ISalesreturnService;
import com.huayu.shopping_mall.service.impl.SalesreturnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
@RequestMapping("/shopping_mall/salesreturn")
public class SalesreturnController {

    @Autowired
    private ISalesreturnService iSalesreturnService;

    @Autowired
    private SalesreturnServiceImpl salesreturnService;

    @RequestMapping("/querySalesreturn")
    public List<Salesreturn> querySalesreturn(Salesreturn salesreturn){


        return salesreturnService.querySalesreturn(salesreturn);
    }

    @RequestMapping("/tuihuokuan")
    public Integer tuihuokuan(Salesreturn salesreturn){
        salesreturn.setSrcldate(new Date());
        salesreturnService.updateById(salesreturn);

        return 200;
    }

}
