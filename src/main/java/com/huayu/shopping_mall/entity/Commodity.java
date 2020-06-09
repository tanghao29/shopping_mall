package com.huayu.shopping_mall.entity;

import lombok.Data;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Data
public class Commodity  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    private String cname;

    private Integer ceid;

    private String ccname;

    private Integer cenumber;

    private BigDecimal cebuymoney;

    private BigDecimal cesellmoney;

    private String ceimg;

    private String cstate;

    private Integer ccid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
    public Integer getCeid() {
        return ceid;
    }

    public void setCeid(Integer ceid) {
        this.ceid = ceid;
    }
    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }
    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }




    @Override
    public String toString() {
        return "Commodity{" +
        "cid=" + cid +
        ", cname=" + cname +
        ", ceid=" + ceid +
        ", cstate=" + cstate +
        ", ccid=" + ccid +
        "}";
    }
}
