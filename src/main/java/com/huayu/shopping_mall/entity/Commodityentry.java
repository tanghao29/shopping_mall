package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public class Commodityentry extends Model<Commodityentry> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ceid", type = IdType.AUTO)
    private Integer ceid;

    private Integer cid;

    private Integer cenumber;

    private String ceimg;

    private Integer uid;

    private Date cedate;

    private BigDecimal cebuymoney;

    private BigDecimal cesellmoney;

    public Integer getCeid() {
        return ceid;
    }

    public void setCeid(Integer ceid) {
        this.ceid = ceid;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public Integer getCenumber() {
        return cenumber;
    }

    public void setCenumber(Integer cenumber) {
        this.cenumber = cenumber;
    }
    public String getCeimg() {
        return ceimg;
    }

    public void setCeimg(String ceimg) {
        this.ceimg = ceimg;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Date getCedate() {
        return cedate;
    }

    public void setCedate(Date cedate) {
        this.cedate = cedate;
    }
    public BigDecimal getCebuymoney() {
        return cebuymoney;
    }

    public void setCebuymoney(BigDecimal cebuymoney) {
        this.cebuymoney = cebuymoney;
    }
    public BigDecimal getCesellmoney() {
        return cesellmoney;
    }

    public void setCesellmoney(BigDecimal cesellmoney) {
        this.cesellmoney = cesellmoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.ceid;
    }

    @Override
    public String toString() {
        return "Commodityentry{" +
        "ceid=" + ceid +
        ", cid=" + cid +
        ", cenumber=" + cenumber +
        ", ceimg=" + ceimg +
        ", uid=" + uid +
        ", cedate=" + cedate +
        ", cebuymoney=" + cebuymoney +
        ", cesellmoney=" + cesellmoney +
        "}";
    }
}
