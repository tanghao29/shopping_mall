package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Refund {



    @TableId(value = "rfid", type = IdType.AUTO)
    private Integer rfid;

    private Integer ofid;

    private String rfcause;

    private Date rfsqdate;

    private Integer aid;

    private String rfstate;

    private Date rfldate;


}
