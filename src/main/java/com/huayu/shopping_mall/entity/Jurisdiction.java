package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public class Jurisdiction  {


    @TableId(value = "jid", type = IdType.AUTO)
    private Integer jid;

    private String jname;

    private String jpath;

    private Integer jsuperior;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }
    public String getJpath() {
        return jpath;
    }

    public void setJpath(String jpath) {
        this.jpath = jpath;
    }
    public Integer getJsuperior() {
        return jsuperior;
    }

    public void setJsuperior(Integer jsuperior) {
        this.jsuperior = jsuperior;
    }



    @Override
    public String toString() {
        return "Jurisdiction{" +
        "jid=" + jid +
        ", jname=" + jname +
        ", jpath=" + jpath +
        ", jsuperior=" + jsuperior +
        "}";
    }
}
