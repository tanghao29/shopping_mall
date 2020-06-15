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
 * @since 2020-06-09
 */
@Data
public class Activities {

    @TableId(value = "asid", type = IdType.AUTO)
    private Integer asid;

    private Integer cid;

    @TableField(exist = false)
    private String cname;

    private Integer skid;

    private Integer adnumber;

    private BigDecimal adprice;

    private Integer adxgnumber;

    private Integer ceid;

    private String asksdatetime;

    private String asjsdatetime;

    private String asstate;


}
