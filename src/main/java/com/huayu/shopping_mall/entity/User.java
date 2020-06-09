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
public class User {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private Integer uaccount;

    private String uname;

    private String upass;

    private String uimg;

    private String ustate;


}
