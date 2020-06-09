package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */

public class Orderform implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ofid", type = IdType.AUTO)
    private Integer ofid;

    private Integer cid;

    private Integer ofnumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ofdate;

    private BigDecimal ofmoney;

    private String ofstate;

    private String ofshname;

    private Integer ofshphone;

    private String ofshsite;


    public String getOfstate() {
        return ofstate;
    }

    public void setOfstate(String ofstate) {
        this.ofstate = ofstate;
    }


    public Integer getOfid() {
        return ofid;
    }

    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getOfnumber() {
        return ofnumber;
    }

    public void setOfnumber(Integer ofnumber) {
        this.ofnumber = ofnumber;
    }

    public Date getOfdate() {
        return ofdate;
    }

    public void setOfdate(Date ofdate) {
        this.ofdate = ofdate;
    }

    public BigDecimal getOfmoney() {
        return ofmoney;
    }

    public void setOfmoney(BigDecimal ofmoney) {
        this.ofmoney = ofmoney;
    }

    public String getOfshname() {
        return ofshname;
    }

    public void setOfshname(String ofshname) {
        this.ofshname = ofshname;
    }

    public Integer getOfshphone() {
        return ofshphone;
    }

    public void setOfshphone(Integer ofshphone) {
        this.ofshphone = ofshphone;
    }

    public String getOfshsite() {
        return ofshsite;
    }

    public void setOfshsite(String ofshsite) {
        this.ofshsite = ofshsite;
    }

    @Override
    public String toString() {
        return "Orderform{" +
                "ofid=" + ofid +
                ", cid=" + cid +
                ", ofnumber=" + ofnumber +
                ", ofdate=" + ofdate +
                ", ofmoney=" + ofmoney +
                ", ofshname=" + ofshname +
                ", ofshphone=" + ofshphone +
                ", ofshsite=" + ofshsite +
                "}";
    }
}
