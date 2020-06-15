package com.huayu.shopping_mall.dynamic;

import org.apache.ibatis.annotations.Param;

public class Searchbrowse {

    public String searchbrowse(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(bdata) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( bdata) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(bdata) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( bdata, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }

        StringBuffer str=new StringBuffer(" select sum(a.a) from (select cid,count(1) a from browse where "+ss+"  group by cid ) a ");




        return str.toString();
    }

    public String ordersCount(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }
        StringBuffer str=new StringBuffer(" select count(1) from (select xuid from orderform where "+ss+" group by xuid) a ");
        return str.toString();
    }

    public String ordersCounts(@Param("nb")String nb,@Param("time") String time){

        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }

        StringBuffer str=new StringBuffer(" select  count(1) from orderform where "+ss+"  ");
        return str.toString();
    }

    public String sumofnumber(@Param("nb")String nb,@Param("time") String time){

        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }

        StringBuffer str=new StringBuffer(" select  sum(ofnumber) from orderform where "+ss+"   ");
        return str.toString();
    }


    public String yxordersCounts(@Param("nb")String nb, @Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }
        StringBuffer str=new StringBuffer(" select  count(1) from orderform where "+ss+" and ofstate !=-1  ");
        return str.toString();
    }

    public String ordersMontey(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }
        StringBuffer str=new StringBuffer(" select  sum(ofmoney) from orderform where "+ss+" and ofstate !=-1  ");
        return str.toString();
    }

    public String refundMoney(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }
        StringBuffer str=new StringBuffer(" select  sum(ofmoney) from orderform where "+ss+" and ofstate=-1  ");
        return str.toString();
    }


    public String paymentCount(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }

        StringBuffer str=new StringBuffer(" select count(1) from (select xuid from orderform  where "+ss+"  and ofstate=1 group by xuid) a  ");
        return str.toString();
    }

//ss
    public String paymentOrderCount(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }
        StringBuffer str=new StringBuffer("  select count(1) from (select * from orderform  where "+ss+" and ofstate=1 ) a  ");
        return str.toString();
    }


    public String paymentOfnumber(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }
        StringBuffer str=new StringBuffer("  select sum(ofnumber) from orderform  where "+ss+" and ofstate=1   ");
        return str.toString();
    }


    public String paymentOfmoney(@Param("nb")String nb,@Param("time") String time){
        String ss="to_days(ofdate) = to_days(now())"; //今天的
        if(null!=nb){
            if(nb.equals("1")){
                ss="   TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = 1 ";
            }
            if(nb.equals("2")){
                ss="   DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(ofdate) ";
            }
            if(nb.equals("3")){
                ss="   DATE_FORMAT( ofdate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) ";
            }

        }
        StringBuffer str=new StringBuffer(" select  sum(ofmoney) from orderform where "+ss+" and ofstate=1  ");
        return str.toString();
    }



}
