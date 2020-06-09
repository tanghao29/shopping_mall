package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Jurisdiction  {


    @TableId(value = "jid", type = IdType.AUTO)
    private Integer jid;

    private String jname;

    private String jpath;

    private Integer jsuperior;


}
