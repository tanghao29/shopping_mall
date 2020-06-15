package com.huayu.shopping_mall.mapper.Provider;

import com.huayu.shopping_mall.entity.Commodity;

public class CommodityProvider {

    public String query(Commodity commodity){
        StringBuffer stringBuffer=new StringBuffer("SELECT c.*, SUM(ce.`cenumber`) cenumber, cc.ccname ccname FROM`commodity` c INNER JOIN `commodityentry` ce INNER JOIN `commodityclassification` cc WHERE c.cid = ce.cid AND c.ccid = cc.ccid ");

        if(commodity.getCname()!=null&&commodity.getCname()!=""){
            stringBuffer.append("AND c.cname LIKE '%"+commodity.getCname()+"%'");
        }

        if(!"".equals(commodity.getCcid())&&commodity.getCcid()!=null){
            stringBuffer.append(" AND c.`ccid`= "+commodity.getCcid());
        }

        if(!"".equals(commodity.getCstate())&&commodity.getCstate()!=null&&commodity.getCstate()!=""){
            stringBuffer.append(" AND c.cstate='"+commodity.getCstate()+"'");
        }


        stringBuffer.append(" GROUP BY c.`cid`");

        return stringBuffer.toString();
    }

}
