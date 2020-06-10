package com.huayu.shopping_mall.mapper.Provider;

import com.huayu.shopping_mall.entity.Seckill;

public class SeckillProvider {

    public String queryLikeSeckills(Seckill seckill) {

        StringBuffer stringBuffer=new StringBuffer("select * from seckill where 1=1 ");

//        模糊查询活动标题
        if (seckill.getSktitle()!=null && seckill.getSktitle()!="" && !seckill.getSktitle().equals("") ){
           stringBuffer.append(" and sktitle like '%"+seckill.getSktitle()+"%'");
        }

//        开始时间区间
        if (seckill.getSkstarttime()!=null && seckill.getSkstarttime()!="" && seckill.getSkstarttimeover()!=null && seckill.getSkstarttimeover()!=""){
            stringBuffer.append(" and skstarttime between "+"'"+seckill.getSkstarttime()+"' and '"+seckill.getSkstarttimeover()+"'");
        }

//        结束时间区间
        if (seckill.getSkendtime()!=null && seckill.getSkendtime()!="" && seckill.getSkendtimeover()!=null && seckill.getSkendtimeover()!=""){
            stringBuffer.append(" and skendtime between "+"'"+seckill.getSkendtime()+"' and '"+seckill.getSkendtimeover()+"'");
        }

//        是否上架
        if (seckill.getSkstate()!=null && seckill.getSkstate()!=""){
                stringBuffer.append(" and skstate="+seckill.getSkstate());
        }

        return stringBuffer.toString();
    }
}
