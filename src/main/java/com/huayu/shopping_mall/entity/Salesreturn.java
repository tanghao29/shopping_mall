package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

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
public class Salesreturn  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "srid", type = IdType.AUTO)
    private Integer srid;

    private Integer ofid;

    @TableField(exist = false)
    private Orderform orderform;

    private String srcause;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date srsqdate;

    @TableField(exist = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date srsqdateover;

    private Integer asid;

    @TableField(exist = false)
    private Activities activities;

    private String srstate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date srcldate;



}
