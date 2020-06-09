package com.huayu.shopping_mall.entity;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public class Roleauthority  {



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
    public String toString() {
        return "Roleauthority{" +
        "rid=" + rid +
        ", jid=" + jid +
        "}";
    }
}
