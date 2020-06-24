package com.huayu.shopping_mall.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huayu.shopping_mall.entity.User;
import com.huayu.shopping_mall.utils.ReturnJson;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
@RequestMapping("/shopping_mall/loginController")
public class LoginController {
    @Autowired
    private RedisTemplate redisTemplate;

    //登录界面
    @RequestMapping("/login")
    @CrossOrigin
    public ReturnJson login(@RequestBody User user) {
        System.out.println(user.getUname()+"uname*-*-*-*-*-*-*-*-*-*-*-*-");

        UsernamePasswordToken tokens = new UsernamePasswordToken(user.getUname(),user.getUpass());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(tokens);
            Session session = subject.getSession();
            String token = (String) session.getId();
            return new ReturnJson(200,"登录成功",(User)subject.getPrincipal(),token);
        } catch (UnknownAccountException uae) {
            //捕获未知用户名异常
            return new ReturnJson(-1, "用户名或密码不正确");
        }
    }

    @GetMapping("/info")
    public ReturnJson info(ServletRequest request){

        User user1 = (User) redisTemplate.opsForValue().get("users");
        System.out.println(user1.toString()+"/*/*/**545456465465*/-*/*-/-*/*/-*");
//        String  str=request.getParameter("token");
//
//        System.out.println(str+"/*/*/*/*/*/*/*/*/*/*/");
        return new ReturnJson(200,"success",user1);
    }


}
