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
public class Refund {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rfid", type = IdType.AUTO)
    private Integer rfid;

    private Integer ofid;

    private String rfcause;

    private Date rfsqdate;

    private Integer aid;

    private String rfstate;

    private Date rfldate;

    public Integer getRfid() {
        return rfid;
    }

    public void setRfid(Integer rfid) {
        this.rfid = rfid;
    }
    public Integer getOfid() {
        return ofid;
    }

    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }
    public String getRfcause() {
        return rfcause;
    }

    public void setRfcause(String rfcause) {
        this.rfcause = rfcause;
    }
    public Date getRfsqdate() {
        return rfsqdate;
    }

    public void setRfsqdate(Date rfsqdate) {
        this.rfsqdate = rfsqdate;
    }
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
    public String getRfstate() {
        return rfstate;
    }

    public void setRfstate(String rfstate) {
        this.rfstate = rfstate;
    }
    public Date getRfldate() {
        return rfldate;
    }

    public void setRfldate(Date rfldate) {
        this.rfldate = rfldate;
    }



    @Override
    public String toString() {
        return "Refund{" +
        "rfid=" + rfid +
        ", ofid=" + ofid +
        ", rfcause=" + rfcause +
        ", rfsqdate=" + rfsqdate +
        ", aid=" + aid +
        ", rfstate=" + rfstate +
        ", rfldate=" + rfldate +
        "}";
    }
}
