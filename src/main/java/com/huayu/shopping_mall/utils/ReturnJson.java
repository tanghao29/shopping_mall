package com.huayu.shopping_mall.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReturnJson {

    private Integer code;
    private String message;
    private Object data;
    private String token;

    public ReturnJson(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ReturnJson(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
