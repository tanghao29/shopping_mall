package com.huayu.shopping_mall.vo;

import com.huayu.shopping_mall.entity.Orderform;
import com.huayu.shopping_mall.entity.Stockremoval;
import com.huayu.shopping_mall.entity.User;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author licheng
 * @date 2020/6/11 11:05
 */
@Data
public class StockremovalVo extends Stockremoval {

    private Integer page;
    private Integer size;

   private Orderform orderform;
   private User user;



}
