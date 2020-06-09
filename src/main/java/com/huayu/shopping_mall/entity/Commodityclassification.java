package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
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
public class Commodityclassification  {


    private static final long serialVersionUID = 1L;

    @TableId(value = "ccid", type = IdType.AUTO)
    private Integer ccid;

    private String ccname;

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }
    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }


    @Override
    public String toString() {
        return "Commodityclassification{" +
        "ccid=" + ccid +
        ", ccname=" + ccname +
        "}";
    }
}
