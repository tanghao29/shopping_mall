package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.Role;
import com.huayu.shopping_mall.service.impl.RoleServiceImpl;
import com.huayu.shopping_mall.service.impl.RoleauthorityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@RestController
@RequestMapping("/shopping_mall/role")
public class RoleController {

    @Autowired
    RoleServiceImpl roleService;

    @Autowired
    RoleauthorityServiceImpl roleauthorityService;

    /*
     * mengqi
     * 添加角色
     * */
    @GetMapping("/addRole")
    @ResponseBody
    @CrossOrigin
    public int addRole(Role role){
        int i=0;
        try {
            roleService.save(role);
        } catch (Exception e) {
            i=1;
            e.printStackTrace();
        }
        return i;
    }

    /*
     * mengqi
     * 查询所有角色
     * */
    @GetMapping("/queryAllRole")
    @ResponseBody
    @CrossOrigin
    public List<Role> queryAllRole(){
        return roleService.list(null);
    }

    /*
     * mengqi
     * 删除角色
     * */

    @GetMapping("/deleteRole")
    @CrossOrigin
    @ResponseBody
    public int deleteRole(Integer rid){
        int i=0;
        try {
            roleauthorityService.deleteByRid(rid);
            roleService.removeById(rid);
        } catch (Exception e) {
            i=1;
            e.printStackTrace();
        }

        return i;
    }

}
