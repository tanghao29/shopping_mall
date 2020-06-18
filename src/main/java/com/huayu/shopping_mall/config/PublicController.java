package com.huayu.shopping_mall.config;

import com.huayu.shopping_mall.entity.User;
import com.huayu.shopping_mall.utils.RespBean;
import com.huayu.shopping_mall.utils.ShiroUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author licheng
 * @date 2020/6/16 15:43
 */
@RestController
@RequestMapping("pub")
@Slf4j
@CrossOrigin(origins = "*") // 支持跨域
public class PublicController {


    @RequestMapping("need_login")
    public RespBean needLogin() {
        //return RespBean.error("温馨提示：请使用对应的账号登录");
        return RespBean.error("未登录老表");
    }

    @RequestMapping("not_permission")
    public RespBean notPermission() {
        // 无权限  403   在前台 做了响应拦截   在 utils  api.js 中找
        return RespBean.error("没有对应的权限老表");
    }


    /**
     * 登录登录都可以访问的接口
     */
    public RespBean index() {

        /**
         * 模拟 数据
         */
        List<String> videoList = new ArrayList<>();
        videoList.add("Mysql");
        videoList.add("Redis");
        videoList.add("Zookeeper+Dubbo");
        videoList.add("RocketMQ");
        videoList.add("微服务SpringCloud+Docker");

        return new RespBean(videoList);
    }


    @PostMapping(value = "/login")
    public RespBean login(@RequestBody UserQuery userQuery) {
        Subject subject = SecurityUtils.getSubject();
        Map<String, Object> info = new HashMap<>(2);

        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userQuery.getUname(), userQuery.getUpass());
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            log.info("------账号或密码错误-----");
            return RespBean.error("账号或密码错误");
        }

        info.put("token", subject.getSession().getId());

        return RespBean.ok("登录成功", info);
    }


    /**
     * 获取当前登录的用户信息
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public RespBean getLoginInfo() {
        //User loginUser = (User) ShiroUtils.getLoginUser();

        String[] aa = {"admin", "editor"};
        User loginUser = new User();
        loginUser.setUname("admin");
        loginUser.setUimg("http://www.0622cc.cn/group1/M00/00/00/rBUAEF7i0ViAXby0AAC79odc4_Y619.jpg");
        loginUser.setUpass("");
        loginUser.setRoles(aa);
        return new RespBean(200, loginUser);
    }


//    @RequestMapping("logout")
//    public RespBean logout() {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject.getPrincipal() != null) {
//
//        }
//        SecurityUtils.getSubject().logout();
//        return RespBean.ok("退出成功");
//
//    }


}



