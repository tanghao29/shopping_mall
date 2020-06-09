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
public class User {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private Integer uaccount;

    private String uname;

    private String upass;

    private String uimg;

    private String ustate;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getUaccount() {
        return uaccount;
    }

    public void setUaccount(Integer uaccount) {
        this.uaccount = uaccount;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }
    public String getUstate() {
        return ustate;
    }

    public void setUstate(String ustate) {
        this.ustate = ustate;
    }



    @Override
    public String toString() {
        return "User{" +
        "uid=" + uid +
        ", uaccount=" + uaccount +
        ", uname=" + uname +
        ", upass=" + upass +
        ", uimg=" + uimg +
        ", ustate=" + ustate +
        "}";
    }
}
