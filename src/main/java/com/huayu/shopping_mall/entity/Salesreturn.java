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
public class Salesreturn  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "srid", type = IdType.AUTO)
    private Integer srid;

    private Integer ofid;

    private String srcause;

    private Date srsqdate;

    private Integer aid;

    private String srstate;

    private Date srcldate;

    public Integer getSrid() {
        return srid;
    }

    public void setSrid(Integer srid) {
        this.srid = srid;
    }
    public Integer getOfid() {
        return ofid;
    }

    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }
    public String getSrcause() {
        return srcause;
    }

    public void setSrcause(String srcause) {
        this.srcause = srcause;
    }
    public Date getSrsqdate() {
        return srsqdate;
    }

    public void setSrsqdate(Date srsqdate) {
        this.srsqdate = srsqdate;
    }
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
    public String getSrstate() {
        return srstate;
    }

    public void setSrstate(String srstate) {
        this.srstate = srstate;
    }
    public Date getSrcldate() {
        return srcldate;
    }

    public void setSrcldate(Date srcldate) {
        this.srcldate = srcldate;
    }



    @Override
    public String toString() {
        return "Salesreturn{" +
        "srid=" + srid +
        ", ofid=" + ofid +
        ", srcause=" + srcause +
        ", srsqdate=" + srsqdate +
        ", aid=" + aid +
        ", srstate=" + srstate +
        ", srcldate=" + srcldate +
        "}";
    }
}
