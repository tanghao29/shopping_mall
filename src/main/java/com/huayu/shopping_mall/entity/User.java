package com.huayu.shopping_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Data
public class User implements Serializable {

    /**
     * 角色集合
     */
    @TableField(exist = false)
    private List<Role> roleList;
    /**
     * 权限集合
     */
    @TableField(exist = false)
    private List<Jurisdiction> permissionList;

    @TableField(exist = false)
    private Set<String> roles;


    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private Integer uaccount;

    private String uname;

    private String upass;

    private String uimg;

    private String ustate;


    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Jurisdiction> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Jurisdiction> permissionList) {
        this.permissionList = permissionList;
    }


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
}
