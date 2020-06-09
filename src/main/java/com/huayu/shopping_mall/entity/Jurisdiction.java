package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

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
public class Jurisdiction extends Model<Jurisdiction> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "jid", type = IdType.AUTO)
    private Integer jid;

    private String jname;

    private String jpath;

    private Integer jsuperior;

    @TableField(exist = false)
    private List<Jurisdiction> children;

    public List<Jurisdiction> getChildren() {
        return children;
    }

    public void setChildren(List<Jurisdiction> children) {
        this.children = children;
    }

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
    protected Serializable pkVal() {
        return this.jid;
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
