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
public class Seckill  {


    private static final long serialVersionUID = 1L;

    @TableId(value = "skid", type = IdType.AUTO)
    private Integer skid;

    @TableField(exist = false)
    private Integer sknubmer;

    @TableField(exist = false)
    private String state;

    private String sktitle;

    private String skstate;

//    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date skstarttime;

//    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date skendtime;

    @TableField(exist = false)
    private Date skstarttimeover;
    @TableField(exist = false)
    private Date skendtimeover;



}
