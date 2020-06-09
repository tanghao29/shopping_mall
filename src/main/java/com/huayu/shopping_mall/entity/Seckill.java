package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public class Seckill  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "skid", type = IdType.AUTO)
    private Integer skid;

    private Integer cid;

    private Integer sknumber;

    private String sktitle;

    private String skstate;

    private Date skstarttime;

    private Date skendtime;

    public Integer getSkid() {
        return skid;
    }

    public void setSkid(Integer skid) {
        this.skid = skid;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public Integer getSknumber() {
        return sknumber;
    }

    public void setSknumber(Integer sknumber) {
        this.sknumber = sknumber;
    }
    public String getSktitle() {
        return sktitle;
    }

    public void setSktitle(String sktitle) {
        this.sktitle = sktitle;
    }
    public String getSkstate() {
        return skstate;
    }

    public void setSkstate(String skstate) {
        this.skstate = skstate;
    }
    public Date getSkstarttime() {
        return skstarttime;
    }

    public void setSkstarttime(Date skstarttime) {
        this.skstarttime = skstarttime;
    }
    public Date getSkendtime() {
        return skendtime;
    }

    public void setSkendtime(Date skendtime) {
        this.skendtime = skendtime;
    }


    @Override
    public String toString() {
        return "Seckill{" +
        "skid=" + skid +
        ", cid=" + cid +
        ", sknumber=" + sknumber +
        ", sktitle=" + sktitle +
        ", skstate=" + skstate +
        ", skstarttime=" + skstarttime +
        ", skendtime=" + skendtime +
        "}";
    }
}
