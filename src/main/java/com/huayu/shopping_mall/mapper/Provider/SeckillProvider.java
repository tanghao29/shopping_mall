package com.huayu.shopping_mall.mapper.Provider;

import com.huayu.shopping_mall.entity.Seckill;

import java.text.ParseException;

public class SeckillProvider {

    public String queryLikeSeckill(Seckill seckill) throws ParseException {

        StringBuffer stringBuffer=new StringBuffer("select * from seckill where 1=1 ");

        if (seckill.getSktitle()!=null && seckill.getSktitle()!="" && !seckill.getSktitle().equals("") ){
           stringBuffer.append(" and sktitle like '%"+seckill.getSktitle()+"%'");
        }

        if (seckill.getSkstarttime()!=null && seckill.getSkstarttime()!="" && seckill.getSkstarttimeover()!=null && seckill.getSkstarttimeover()!=""){

            stringBuffer.append(" and skstarttime between "+"'"+seckill.getSkstarttime()+"' and '"+seckill.getSkstarttimeover()+"'");
        }

        if (seckill.getSkendtime()!=null && seckill.getSkendtime()!="" && seckill.getSkendtimeover()!=null && seckill.getSkendtimeover()!=""){
            stringBuffer.append(" and skendtime between "+"'"+seckill.getSkendtime()+"' and '"+seckill.getSkendtimeover()+"'");
        }

        if (seckill.getSkstate()!=null && seckill.getSkstate()!=""){
                stringBuffer.append(" and skstate="+seckill.getSkstate());
        }

        return stringBuffer.toString();
    }
}
