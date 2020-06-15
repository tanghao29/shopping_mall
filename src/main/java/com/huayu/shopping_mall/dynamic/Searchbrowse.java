package com.huayu.shopping_mall.dynamic;

import org.apache.ibatis.annotations.Param;

public class Searchbrowse {

    public String searchbrowse(@Param("nb")String nb){

        StringBuffer str=new StringBuffer(" select sum(a.a) from (select cid,count(1) a from browse where to_days(bdata) = to_days(now())  group by cid ) a ");

        return str.toString();
    }

    public String ordersCount(@Param("nb")String nb){
        StringBuffer str=new StringBuffer(" select count(1) from (select xuid from orderform where to_days(ofdate) = to_days(now()) group by xuid) a ");
        return str.toString();
    }

    public String ordersCounts(@Param("nb")String nb){
        StringBuffer str=new StringBuffer(" select  count(1) from orderform where to_days(ofdate) = to_days(now())  ");
        return str.toString();
    }

    public String sumofnumber(@Param("nb")String nb){
        StringBuffer str=new StringBuffer(" select  sum(ofnumber) from orderform where to_days(ofdate) = to_days(now())   ");
        return str.toString();
    }


}
