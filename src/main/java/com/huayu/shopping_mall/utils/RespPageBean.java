package com.huayu.shopping_mall.utils;

import java.util.List;

/**
 * @author licheng
 * @date 2020/6/5 10:17
 */
public class RespPageBean {

    private Long total;
    private List<?> data;


    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
