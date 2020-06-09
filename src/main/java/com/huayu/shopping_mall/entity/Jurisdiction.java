package com.huayu.shopping_mall.entity;

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
public class Jurisdiction  {


    @TableId(value = "jid", type = IdType.AUTO)
    private Integer jid;

    private String jname;

    private String jpath;

    private Integer jsuperior;


}
