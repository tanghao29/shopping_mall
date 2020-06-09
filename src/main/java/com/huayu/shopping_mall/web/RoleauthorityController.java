package com.huayu.shopping_mall.web;


import com.huayu.shopping_mall.entity.Roleauthority;
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
@RequestMapping("/shopping_mall/roleauthority")
public class RoleauthorityController {

    @Autowired
    RoleauthorityServiceImpl roleauthorityService;


    /*
     * mengqi
     * 根据id查询角色权限
     * */
    @GetMapping("/queryRoleauthorityById")
    @ResponseBody
    @CrossOrigin
    public  Integer [] queryRoleauthorityById(Integer rid){
        List<Roleauthority> list=roleauthorityService.queryRoleauthorityByid(rid);
        Integer [] in=new  Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            in[i]=list.get(i).getJid();
            System.out.println(in[i]);
        }
        return in;
    }

    /*
    *
    *
    * mengqi
    * 修改角色权限
    * */
    @GetMapping("/updateRoleauth")
    @CrossOrigin
    @ResponseBody
    public void updateRoleauth(Integer rid,Integer[] jid){
        roleauthorityService.deleteByRid(rid);
        if(null!=jid){
            Roleauthority roleauthority=new Roleauthority();
            for (int i = 0; i < jid.length; i++) {
                roleauthority.setRid(rid);
                roleauthority.setJid(jid[i]);
                roleauthorityService.save(roleauthority);
            }
        }
    }
}
