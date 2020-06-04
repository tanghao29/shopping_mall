package com.huayu.shopping_mall.web;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@RestController
@RequestMapping("/shopping_mall/commodityclassification")
public class CommodityclassificationController {

    @RequestMapping("/test")
    public String test(){
        return "fnjsadkjfkjhsda";
    }

}
