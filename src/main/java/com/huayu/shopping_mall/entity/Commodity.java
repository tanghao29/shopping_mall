package com.huayu.shopping_mall.entity;

import lombok.Data;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Data
public class Commodity  {

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    private String cname;

    private Integer ceid;

    private String ccname;

    private Integer cenumber;

    private BigDecimal cebuymoney;

    private BigDecimal cesellmoney;

    private String ceimg;

    private String cstate;

    private Integer ccid;


}
