package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * 商品入库
 * @author mq
 * @since 2020-06-04
 */
@Data
public class Commodityentry implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ceid", type = IdType.AUTO)
    private Integer ceid;

    private Integer cid;

    private Integer cenumber;

    private String ceimg;

    private Integer uid;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date cedate;

    private BigDecimal cebuymoney;

    private BigDecimal cesellmoney;


    private Commodity commodity;
    private User user;
    private String uname;




}
