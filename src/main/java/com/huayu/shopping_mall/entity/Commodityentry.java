package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 * <p>
 * 商品入库
 *
 * @author mq
 * @since 2020-06-04
 */

@TableName(value = "commodityentry")
public class Commodityentry implements Serializable {


    @TableId(value = "ceid", type = IdType.AUTO)
    private Integer ceid;

    @TableField(value = "cid")
    private Integer cid;

    @TableField(value = "cenumber")
    private String cenumber;

    @TableField(value = "ceimg")
    private String ceimg;

    @TableField(value = "uid")
    private Integer uid;

    @TableField(value = "cedate")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private String cedate;


    @TableField(value = "cebuymoney")
    private String cebuymoney;

    @TableField(value = "cesellmoney")
    private BigDecimal cesellmoney;


    /**
     * 参数 id
     */
    @TableField(value = "ccid")
    private Integer ccid;

    /**
     * 规格 id
     */
    @TableField(value = "sid")
    private Integer sid;


    @TableField(exist = false)
    private Commodity commodity;

    @TableField(exist = false)
    private User user;
    //    private String uname;
    @TableField(exist = false)
    private String cname;


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

    public String getCenumber() {
        return cenumber;
    }

    public void setCenumber(String cenumber) {
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

    public String getCedate() {
        return cedate;
    }

    public void setCedate(String cedate) {
        this.cedate = cedate;
    }

    public String getCebuymoney() {
        return cebuymoney;
    }

    public void setCebuymoney(String cebuymoney) {
        this.cebuymoney = cebuymoney;
    }

    public BigDecimal getCesellmoney() {
        return cesellmoney;
    }

    public void setCesellmoney(BigDecimal cesellmoney) {
        this.cesellmoney = cesellmoney;
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
