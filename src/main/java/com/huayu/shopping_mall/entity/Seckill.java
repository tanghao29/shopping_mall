package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

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

    private String sktitle;

    private String skstate;

    private String skstarttime;

    private String skendtime;

    @TableField(exist = false)
    private String skstarttimeover;
    @TableField(exist = false)
    private String skendtimeover;



}
