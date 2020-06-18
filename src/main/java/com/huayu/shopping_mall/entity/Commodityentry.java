package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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

    @TableField(exist = false)
    private String cname;

    private Integer cenumber;

    private String ceimg;

    private Integer uid;

    private Integer sid;

    @TableField(exist = false)
    private String sname;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date cedate;

    private BigDecimal cebuymoney;

    private BigDecimal cesellmoney;


    @TableField(exist = false)
    private Commodity commodity;

    @TableField(exist = false)
    private User user;

    @TableField(exist = false)
    private String uname;

    private String cecoloutr;

    @TableField(exist = false)
    private Integer ccid;










}
