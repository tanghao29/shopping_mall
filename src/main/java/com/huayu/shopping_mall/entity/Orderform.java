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
public class Orderform extends Model<Orderform> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ofid", type = IdType.AUTO)
    private Integer ofid;

    private Integer cid;

    private Integer ofnumber;

    private Date ofdate;

    private BigDecimal ofmoney;

    private String ofstate;

    private String ofshname;

    private Integer ofshphone;

    private String ofshsite;

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
    public String getOfstate() {
        return ofstate;
    }

    public void setOfstate(String ofstate) {
        this.ofstate = ofstate;
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
    protected Serializable pkVal() {
        return this.ofid;
    }

    @Override
    public String toString() {
        return "Orderform{" +
        "ofid=" + ofid +
        ", cid=" + cid +
        ", ofnumber=" + ofnumber +
        ", ofdate=" + ofdate +
        ", ofmoney=" + ofmoney +
        ", ofstate=" + ofstate +
        ", ofshname=" + ofshname +
        ", ofshphone=" + ofshphone +
        ", ofshsite=" + ofshsite +
        "}";
    }
}
