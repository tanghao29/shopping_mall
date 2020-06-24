package com.huayu.shopping_mall.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Data
public class Userrole  {

    @TableId
    private Integer uid;
    @TableId
    private Integer rid;


}
