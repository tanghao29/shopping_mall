package com.huayu.shopping_mall.dynamic;

import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  bdata between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
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

            if(nb.equals("4")){
                System.out.println("开始时间到结束时间：===============》"+time);
                String [] tt=time.split(",");
                if(!time.equals("NaN-NaN-NaN,NaN-NaN-NaN")){
                    ss = "  ofdate between '" + tt[0] + "' and '" + tt[1] + "'     ";
                }
            }

        }
        StringBuffer str=new StringBuffer(" select  sum(ofmoney) from orderform where "+ss+" and ofstate=1  ");
        return str.toString();
    }


    //折线统计
    //付款金额
    public String zxPaymentOfnumber(@Param("flag")Integer flag) {
        String ss=" to_days(ofdate) = to_days(now()) ";
        if(null!=flag) {
            if(flag==0){
                ss=" to_days(ofdate) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = "+flag+"  ";
        }

        StringBuffer str=new StringBuffer("  select sum(ofmoney) from orderform  where "+ss+" and ofstate=1    ");
        return str.toString();
    }

    //退款金额
    public String zxRefundMoney(@Param("flag")Integer flag) {
        String ss=" to_days(ofdate) = to_days(now()) ";
        if(null!=flag) {
            if(flag==0){
                ss=" to_days(ofdate) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = "+flag+"  ";
        }
        StringBuffer str=new StringBuffer(" select  sum(ofmoney) from orderform where "+ss+" and ofstate=-1  ");
        return str.toString();
    }



    //付款人数
    public String zxPaymentCount(@Param("flag")Integer flag) {
        String ss=" to_days(ofdate) = to_days(now()) ";
        if(null!=flag) {
            if(flag==0){
                ss=" to_days(ofdate) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = "+flag+"  ";
        }
        StringBuffer str=new StringBuffer(" select count(1) from (select xuid from orderform  where "+ss+"  and ofstate=1 group by xuid) a  ");
        return str.toString();
    }

    //付款人数
    public String zxPaymentOfnumberUser(@Param("flag")Integer flag) {
        String ss=" to_days(ofdate) = to_days(now()) ";
        if(null!=flag) {
            if(flag==0){
                ss=" to_days(ofdate) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = "+flag+"  ";
        }
        StringBuffer str=new StringBuffer("  select sum(ofnumber) from orderform  where "+ss+" and ofstate=1   ");
        return str.toString();
    }

    //折线浏览人数
    //付款人数
    public String zxSearchbrowse(@Param("flag")Integer flag) {
        String ss=" to_days(bdata) = to_days(now()) ";
        if(null!=flag) {
            if(flag==0){
                ss=" to_days(bdata) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( bdata) = "+flag+"  ";
        }
        StringBuffer str=new StringBuffer(" select sum(a.a) from (select cid,count(1) a from browse where "+ss+"  group by cid ) a ");
        return str.toString();
    }
    //折线浏览人数
    //下单人数
    public String zxOrdersCount(@Param("flag")Integer flag) {
        String ss=" to_days(ofdate) = to_days(now()) ";
        if(null!=flag) {
            if(flag==0){
                ss=" to_days(ofdate) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = "+flag+"  ";
        }
        StringBuffer str=new StringBuffer(" select count(1) from (select xuid from orderform where "+ss+" group by xuid) a ");
        return str.toString();
    }
    //折线浏览人数
    //付款人数
    public String zxPaymentCountXuid(@Param("flag")Integer flag) {
        String ss=" to_days(ofdate) = to_days(now()) ";
        if(null!=flag) {
            if(flag==0){
                ss=" to_days(ofdate) = to_days(now()) ";
            }
            ss=" TO_DAYS( NOW( ) ) - TO_DAYS( ofdate) = "+flag+"  ";
        }
        StringBuffer str=new StringBuffer(" select count(1) from (select xuid from orderform  where "+ss+"  and ofstate=1 group by xuid) a  ");
        return str.toString();
    }




    public String mqHistogramcolumn(@Param("starttime") String starttime,@Param("endtime") String endtime,@Param("startprice") Integer startprice,@Param("endprice") Integer endprice){
    StringBuffer str=new StringBuffer(" select  count(1)  from orderform where 1=1  ");
        String  timezone=" and to_days(ofdate) = to_days(now())    ";
        String  moneyzone="";
        if(!StringUtils.isEmpty(starttime) && !StringUtils.isEmpty(endtime)){
              timezone=" and ofdate between '"+starttime+"' and  '"+endtime+"'  ";

        }
        if(!StringUtils.isEmpty(startprice) && !StringUtils.isEmpty(endprice)){
              moneyzone=" and ofmoney between "+startprice+" and  "+endprice+"  ";

        }

        if(startprice==10000 && endprice==0){
              moneyzone=" and ofmoney>10000  ";
        }

        str.append(timezone);
        str.append(moneyzone);

        return str.toString();
    }




}
