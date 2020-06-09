package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public class Stockremoval  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "srid", type = IdType.AUTO)
    private Integer srid;

    private Integer cid;

    private Date srdate;

    private Integer ofid;

    public Integer getSrid() {
        return srid;
    }

    public void setSrid(Integer srid) {
        this.srid = srid;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public Date getSrdate() {
        return srdate;
    }

    public void setSrdate(Date srdate) {
        this.srdate = srdate;
    }
    public Integer getOfid() {
        return ofid;
    }

    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }


    @Override
    public String toString() {
        return "Stockremoval{" +
        "srid=" + srid +
        ", cid=" + cid +
        ", srdate=" + srdate +
        ", ofid=" + ofid +
        "}";
    }
}
