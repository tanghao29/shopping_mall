package com.huayu.shopping_mall.mapper.Provider;

public class specificationProvider {

    public String query(Integer ccid){
        StringBuffer stringBuffer=new StringBuffer("");
        if(ccid!=null&&!ccid.equals("")&&ccid!=0){

            stringBuffer.append("select * from specification s inner join commodityclassification c where s.ccid=c.ccid  and c.ccid="+ccid);
        }else{
             stringBuffer.append("select * from specification s left join commodityclassification c on s.ccid=c.ccid ");
        }

        return stringBuffer.toString();
    }

}
