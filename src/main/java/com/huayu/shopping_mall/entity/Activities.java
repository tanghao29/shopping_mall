package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-09
 */
@Data
public class Activities {

    @TableId(value = "asid", type = IdType.AUTO)
    private Integer asid;

    private Integer cid;

    private Integer skid;

    private Integer adnumber;

    private BigDecimal adprice;

    private Integer adxgnumber;

    private Integer ceid;

    private Date asksdatetime;

    private Date asjsdatetime;


}
