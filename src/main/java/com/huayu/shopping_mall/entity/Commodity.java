package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

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

    @TableField(exist = false)
    private String ccname;

    @TableField(exist = false)
    private Integer cenumber;

    @TableField(exist = false)
    private BigDecimal cebuymoney;

    @TableField(exist = false)
    private BigDecimal cesellmoney;

    @TableField(exist = false)
    private String ceimg;

    private String cstate;

    private Integer ccid;


}
