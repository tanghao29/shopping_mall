package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.Role;
import com.huayu.shopping_mall.entity.User;
import com.huayu.shopping_mall.entity.Userrole;
import com.huayu.shopping_mall.service.impl.RoleServiceImpl;
import com.huayu.shopping_mall.service.impl.UserServiceImpl;
import com.huayu.shopping_mall.service.impl.UserroleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Controller
@RequestMapping("/shopping_mall/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserroleServiceImpl userroleService;

    @Autowired
    RoleServiceImpl roleService;
    /*@author mengqi
    * 查询出所有的用户
    * */

    @GetMapping("/userqueryall")
    @ResponseBody
    public List<User> queryall(){
        System.out.println("进来了啊铁子");
        return userService.list(null);
     }


    /*@author mengqi
     * 改变用户状态
     * */
    @CrossOrigin
    @GetMapping("/updatebyustatu")
    @ResponseBody
    public int updatebystatu(int uid,int ustate){
        int i=0;
        System.out.println(uid+":"+ustate);
        userService.updateUserStatu(uid,String.valueOf(ustate));
        return i;
    }
    /*@author mengqi
     * 修改user
     * */
    @GetMapping("/updateUser")
    @ResponseBody
    @CrossOrigin
    public int updateUser(User user,String citys){
        String str=citys.substring(1,citys.length()-1);
        if(str.indexOf("all")==-1){
            userroleService.removeByUid(user.getUid());
            System.out.println("===========>"+str);
            if(!"".equals(str)){
                String [] st=str.split(",");
                Userrole userrole=new Userrole();
                for (String s : st) {
                    System.out.println("==》"+s);
                    userrole.setUid(user.getUid());
                    userrole.setRid(Integer.parseInt(s));
                    userroleService.save(userrole);
                }
            }

        }else{
            userroleService.removeByUid(user.getUid());
            List<Role> list=roleService.list(null);
            Userrole userrole=new Userrole();
            for (Role role : list) {
                userrole.setUid(user.getUid());
                userrole.setRid(role.getRid());
                userroleService.save(userrole);
            }

        }

        int i=0;
        try {
            userService.updateById(user);
        } catch (Exception e) {
            i++;
            e.printStackTrace();
        }
        return i;
    }

    /*@author mengqi
     * 查询user的角色
     * */
    @GetMapping("/queryUserRole")
    @CrossOrigin
    @ResponseBody
    public Integer[] queryUserRole(Integer uid){
        List<Userrole> list=userroleService.queryUserRole(uid);
        Integer[] in=new Integer[list.size()];
        if(list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                in[i]=list.get(i).getRid();
            }
        }
       return in;
    }


    /*
    * mengqi
    * user搜索
    * */
    @GetMapping("/searchUser")
    @ResponseBody
    @CrossOrigin
    public List<User> searchUser(User user){
        return userService.searchUser(user);
    }

    @RequestMapping("/insertuser")
    public Integer insertuser(User user){

        userService.save(user);
        return 200;
    }

}
