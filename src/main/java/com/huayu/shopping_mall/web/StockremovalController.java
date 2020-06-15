package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Stockremoval;
import com.huayu.shopping_mall.service.impl.StockremovalServiceImpl;
import com.huayu.shopping_mall.utils.RespBean;
import com.huayu.shopping_mall.utils.RespPageBean;
import com.huayu.shopping_mall.vo.StockremovalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@RestController
@RequestMapping("/shopping_mall/stockremoval")
public class StockremovalController {

    @Autowired
    StockremovalServiceImpl stockremovalService;

    @GetMapping("/")
    public RespPageBean getAllReturnGoods(StockremovalVo stockremovalVo){
        return stockremovalService.getAllReturnGoods(stockremovalVo);
    }
}
