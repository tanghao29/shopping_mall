package com.huayu.shopping_mall.entity;

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
public class Userjurisdiction extends Model<Userjurisdiction> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer jid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

    @Override
    public String toString() {
        return "Userjurisdiction{" +
        "uid=" + uid +
        ", jid=" + jid +
        "}";
    }
}
