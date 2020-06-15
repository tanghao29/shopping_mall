package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 * <p>
 * 商品入库
 *
 * @author mq
 * @since 2020-06-04
 */
@Data
@TableName(value = "commodityentry")
public class Commodityentry implements Serializable {


    @TableId(value = "ceid", type = IdType.AUTO)
    private Integer ceid;

    @TableField(value = "cid")
    private Integer cid;

    @TableField(value = "cenumber")
    private String cenumber;

    @TableField(value = "ceimg")
    private String ceimg;

    @TableField(value = "uid")
    private Integer uid;

    @TableField(value = "cedate")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private String cedate;


    @TableField(value = "cebuymoney")
    private String cebuymoney;

    @TableField(value = "cesellmoney")
    private BigDecimal cesellmoney;

    @TableField(exist = false)
    private String sname;

    /**
     * 参数 id
     */
    @TableField(value = "ccid")
    private Integer ccid;

    /**
     * 规格 id
     */
    @TableField(value = "sid")
    private Integer sid;


    @TableField(exist = false)
    private Commodity commodity;

    @TableField(exist = false)
    private User user;
    //    private String uname;
    @TableField(exist = false)
    private String cname;



}
