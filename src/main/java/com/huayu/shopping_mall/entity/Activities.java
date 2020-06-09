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
 * @since 2020-06-09
 */
public class Activities extends Model<Activities> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "asid", type = IdType.AUTO)
    private Integer asid;

    private Integer cid;

    private Integer skid;

    private Integer adnumber;

    private BigDecimal adprice;

    private Integer adxgnumber;

    private Integer ceid;

    private Date asksdatetime;

    private Date asjsdatetime;

    public Integer getAsid() {
        return asid;
    }

    public void setAsid(Integer asid) {
        this.asid = asid;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public Integer getSkid() {
        return skid;
    }

    public void setSkid(Integer skid) {
        this.skid = skid;
    }
    public Integer getAdnumber() {
        return adnumber;
    }

    public void setAdnumber(Integer adnumber) {
        this.adnumber = adnumber;
    }
    public BigDecimal getAdprice() {
        return adprice;
    }

    public void setAdprice(BigDecimal adprice) {
        this.adprice = adprice;
    }
    public Integer getAdxgnumber() {
        return adxgnumber;
    }

    public void setAdxgnumber(Integer adxgnumber) {
        this.adxgnumber = adxgnumber;
    }
    public Integer getCeid() {
        return ceid;
    }

    public void setCeid(Integer ceid) {
        this.ceid = ceid;
    }
    public Date getAsksdatetime() {
        return asksdatetime;
    }

    public void setAsksdatetime(Date asksdatetime) {
        this.asksdatetime = asksdatetime;
    }
    public Date getAsjsdatetime() {
        return asjsdatetime;
    }

    public void setAsjsdatetime(Date asjsdatetime) {
        this.asjsdatetime = asjsdatetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.asid;
    }

    @Override
    public String toString() {
        return "Activities{" +
        "asid=" + asid +
        ", cid=" + cid +
        ", skid=" + skid +
        ", adnumber=" + adnumber +
        ", adprice=" + adprice +
        ", adxgnumber=" + adxgnumber +
        ", ceid=" + ceid +
        ", asksdatetime=" + asksdatetime +
        ", asjsdatetime=" + asjsdatetime +
        "}";
    }
}
