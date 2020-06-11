package com.huayu.shopping_mall.mapper.Provider;

import com.huayu.shopping_mall.entity.Seckill;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SeckillProvider {

    public String queryLikeSeckills(Seckill seckill) throws ParseException {

        StringBuffer stringBuffer=new StringBuffer("select * from seckill where 1=1 ");

//        模糊查询活动标题
        if (seckill.getSktitle()!=null && seckill.getSktitle()!="" && !seckill.getSktitle().equals("") ){
           stringBuffer.append(" and sktitle like '%"+seckill.getSktitle()+"%'");
        }

//        开始时间区间
        if(seckill.getSkstarttime()!=null && seckill.getSkstarttimeover()==null){
            SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
            stringBuffer.append(" and skstarttime >= '"+sdf2.format(seckill.getSkstarttime()).toString()+"'");

        }
        if (seckill.getSkstarttime()!=null &&  seckill.getSkstarttimeover()!=null){
            SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
            stringBuffer.append(" and skstarttime between "+"'"+sdf2.format(seckill.getSkstarttime())+"' and '"+sdf2.format(seckill.getSkstarttimeover())+"'");
        }

//        结束时间区间
        if(seckill.getSkendtime()!=null && seckill.getSkendtimeover()==null){
            SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
            stringBuffer.append(" and skendtime <= '"+sdf2.format(seckill.getSkendtime()).toString()+"'");

        }
        if (seckill.getSkendtime()!=null  && seckill.getSkendtimeover()!=null ){
            SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
            stringBuffer.append(" and skendtime between "+"'"+sdf2.format(seckill.getSkendtime())+"' and '"+sdf2.format(seckill.getSkendtimeover())+"'");
        }

//        是否上架
        if (seckill.getSkstate()!=null && seckill.getSkstate()!=""){
                stringBuffer.append(" and skstate="+seckill.getSkstate());
        }

        return stringBuffer.toString();
    }
}
