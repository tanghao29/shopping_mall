package com.huayu.shopping_mall.entity;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public class Userrole  {


    private Integer uid;

    private Integer rid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }


    @Override
    public String toString() {
        return "Userrole{" +
        "uid=" + uid +
        ", rid=" + rid +
        "}";
    }
}
