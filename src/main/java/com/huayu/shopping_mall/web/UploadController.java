package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.utils.RespBean;
import com.huayu.shopping_mall.utils.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author licheng
 * @date 2020/6/11 21:42
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    /**
     * 上传文件
     * @param file
     * @return
     */
    @RequestMapping(value = "/uploadImage")
    public RespBean uploadImage(MultipartFile file){
System.out.println(file+"212");

        String url = uploadService.uploadImage(file);
        return new RespBean("上传成功",url);
    }
}
