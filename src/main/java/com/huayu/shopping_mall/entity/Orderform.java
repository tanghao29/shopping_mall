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
 * @author mq
 * @since 2020-06-04
 */
@Data
public class Orderform implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ofid", type = IdType.AUTO)
    private Integer ofid;

    private Integer cid;

    private Integer ofnumber;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date ofdate;

    private BigDecimal ofmoney;

    private String ofstate;

    private String ofshname;

    private Integer ofshphone;

    private String ofshsite;

    @TableField(exist = false)
    private Integer xuid;

}
