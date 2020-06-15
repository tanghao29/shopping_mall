package com.huayu.shopping_mall.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * 文件上传配置类
 * @author licheng
 * @date 2020/6/11 21:35
 */
@Data
@ConfigurationProperties(prefix = "upload")
public class UploadConfig {

    private String baseUrl;
    private List<String> allowTypes;

}
