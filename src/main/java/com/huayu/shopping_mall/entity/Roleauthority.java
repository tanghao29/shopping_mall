package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public class Roleauthority extends Model<Roleauthority> {

    private static final long serialVersionUID = 1L;

    private Integer rid;

    private Integer jid;

 


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    @Override
    protected Serializable pkVal() {
        return this.rid;
    }

    @Override
    public String toString() {
        return "Roleauthority{" +
        "rid=" + rid +
        ", jid=" + jid +
        "}";
    }
}
