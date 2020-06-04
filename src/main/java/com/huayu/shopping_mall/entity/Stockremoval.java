package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
public class Stockremoval extends Model<Stockremoval> {

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
    protected Serializable pkVal() {
        return this.srid;
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
