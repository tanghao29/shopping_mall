package com.huayu.shopping_mall.vo;

import com.huayu.shopping_mall.entity.Orderform;
import lombok.Data;

/**
 * @author licheng
 * @date 2020/6/6 10:27
 */
@Data
public class OrderformVo extends Orderform {

    private Integer page;
    private Integer limit;



}
