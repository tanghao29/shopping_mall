package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-11
 */

@Data
public class Browse implements Serializable {

    @TableId(value = "bid", type = IdType.AUTO)
    private Integer bid;

    private Integer cid;

    private LocalDate bdata;

    private Integer uid;


}
