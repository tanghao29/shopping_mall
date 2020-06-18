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
 *
 * @author mq
 * @since 2020-06-04
 */
@Data
@TableName(value = "orderform")
public class Orderform implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ofid", type = IdType.AUTO)
    private Integer ofid;

    @TableField(value = "cid")
    private Integer cid;

    @TableField(value = "ofnumber")
    private Integer ofnumber;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @TableField(value = "ofdate")
    private Date ofdate;

    @TableField(value = "ofmoney")
    private BigDecimal ofmoney;

    @TableField(value = "ofstate")
    private String ofstate;

    @TableField(value = "ofshname")
    private String ofshname;

    @TableField(value = "ofshphone")
    private Integer ofshphone;

    @TableField(value = "ofshsite")
    private String ofshsite;

    @TableField(exist = false)
    private Integer uid;

}
