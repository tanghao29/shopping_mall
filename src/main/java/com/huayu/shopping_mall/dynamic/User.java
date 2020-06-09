package com.huayu.shopping_mall.dynamic;

import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

public class User {

    public String searchUser(@Param("user") com.huayu.shopping_mall.entity.User user){
        StringBuffer str=new StringBuffer("select * from user where 1=1");
        if(!StringUtils.isEmpty(user.getUname())){
            str.append(" and uname like '%"+user.getUname()+"%' ");
        }

        if(!StringUtils.isEmpty(user.getUaccount())){
            str.append(" and uaccount like '%"+user.getUaccount()+"%' ");
        }

        if(!StringUtils.isEmpty(user.getUstate())){
            str.append(" and ustate = '"+user.getUstate()+"'  ");
        }
        return str.toString();
    }
}
