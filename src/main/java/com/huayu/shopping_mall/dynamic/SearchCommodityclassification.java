package com.huayu.shopping_mall.dynamic;

import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

public class SearchCommodityclassification {

    public String commodityClassification(@Param("time")String time ){
        String ss=" to_days(ofdate) = to_days(now()) ";

        if(!StringUtils.isEmpty(time)){
            String [] tt=time.split(",");
            if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
            }
        }
        StringBuffer str=new StringBuffer("  select ccname from  commodityclassification where ccid in(select  ccid from commodity where cid in (select cid from orderform where ofstate!=-1 and "+ss+" group by cid) group by ccid)  ");
        return str.toString();
    }

    public String commodityClassificationdata(@Param("time") String time){

        String ss=" to_days(o.ofdate) = to_days(now()) ";

        if(!StringUtils.isEmpty(time)){
            String [] tt=time.split(",");
            if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                ss = "  o.ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
            }
        }


        StringBuffer str=new StringBuffer(" select  sum(o.ofnumber) value ,com.ccname name  from  commodityclassification com ,commodity c,orderform o where com.ccid=c.ccid and c.cid=o.cid and o.ofstate!=-1 and "+ss+" group by com.ccid  ");
        return str.toString();
    }

    public String commodityClassificationmoney(@Param("time") String time){

        String ss=" to_days(o.ofdate) = to_days(now()) ";

        if(!StringUtils.isEmpty(time)){
            String [] tt=time.split(",");
            if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                ss = "  o.ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
            }
        }
        StringBuffer str=new StringBuffer(" select  sum(o.ofmoney) value ,com.ccname  name  from  commodityclassification com ,commodity c,orderform o where com.ccid=c.ccid and c.cid=o.cid and o.ofstate!=-1 and "+ss+" group by com.ccid  ");
        return str.toString();
    }


        public String commoditystatistics(@Param("time") String time){

            String ss=" to_days(o.ofdate) = to_days(now()) ";
            if(!StringUtils.isEmpty(time)){
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  o.ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
            }
            StringBuffer str=new StringBuffer(" select   c.cname cname,(select count(1) from  browse where cid=c.cid)  pageview,(select count(1) from (select uid from  browse  where cid=c.cid  group by uid) a)  pageviewcount,(select count(1)  from (select   xuid from orderform o where ofstate!=-1 and cid=c.cid   group by xuid) a) paymentcount,  ((sum(ofnumber))  / (select count(1) from  browse where cid=c.cid) * 100 )  percentconversion   ,sum(ofnumber) salesquantity,sum(ofmoney) salesamount  from  commodity c,orderform o where  c.cid=o.cid and o.ofstate!=-1 and "+ss+"  group by c.cid  ");
            return str.toString();
        }




    public String categoryData(@Param("time") Integer time,@Param("ccname")String ccname){
        String ss=" to_days(o.ofdate) = to_days(now()) ";
        String ss2=" 1=1 ";
        if(!StringUtils.isEmpty(time)){
            if(time==0){
                ss=" to_days(ofdate) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = "+time+"  ";
        }

        if(!StringUtils.isEmpty(ccname)){
            ss2=" com.ccname='"+ccname+"'  ";
        }

        StringBuffer str=new StringBuffer(" select  sum(o.ofmoney) value  from  commodityclassification com ,commodity c,orderform o where com.ccid=c.ccid and c.cid=o.cid and o.ofstate!=-1 and "+ss+" and  "+ss2+" group by com.ccid  ");
        return str.toString();
    }





}
