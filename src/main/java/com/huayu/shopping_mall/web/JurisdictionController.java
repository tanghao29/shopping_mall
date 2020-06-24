package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.Jurisdiction;
import com.huayu.shopping_mall.service.impl.JurisdictionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
@RequestMapping("/shopping_mall/jurisdiction")
public class JurisdictionController {

    @Autowired
    JurisdictionServiceImpl jurisdictionService;

//    /*
//     * mengqi
//     * 查询所有权限
//     * */
//    @GetMapping("/queryAllJur")
//    @ResponseBody
//    @CrossOrigin
//    public List<Jurisdiction> queryAllJur(){
//
//        List<Jurisdiction> requestlist=new ArrayList<>();
//        List<Jurisdiction> list=jurisdictionService.list(null);
//        for (int i = 0; i < list.size(); i++) {
//            if(null==list.get(i).getJsuperior()){
//                requestlist.add(list.get(i));
//            }
//
//        }
//
//
//
//            for (int i1 = 0; i1 < requestlist.size(); i1++) {
//                List<Jurisdiction> aadlist=new ArrayList<>();
//                for (int i = 0; i < list.size(); i++) {
//                    if (requestlist.get(i1).getJid() == list.get(i).getJsuperior()) {
//                        Jurisdiction jurisdiction=new Jurisdiction();
//                        jurisdiction.setJid(list.get(i).getJid());
//                        jurisdiction.setJname(list.get(i).getJname());
//                        aadlist.add(jurisdiction);
//
//                    }
//                }
//
//                requestlist.get(i1).setChildren(aadlist);
//
//            }
//
//        return requestlist;
//    }





}
