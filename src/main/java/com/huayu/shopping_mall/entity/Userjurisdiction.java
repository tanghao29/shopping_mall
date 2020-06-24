package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-23
 */
@Data
public class Userjurisdiction implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private Integer uid;
    @TableId
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
    public String toString() {
        return "Userjurisdiction{" +
        "uid=" + uid +
        ", jid=" + jid +
        "}";
    }
}
