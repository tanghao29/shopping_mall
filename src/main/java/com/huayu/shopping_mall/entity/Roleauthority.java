package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Roleauthority  {


    @TableId
    private Integer rid;
    @TableId
    private Integer jid;


}
