package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.Activities;
import com.huayu.shopping_mall.mapper.ActivitiesMapper;
import com.huayu.shopping_mall.service.IActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-06-09
 */
@RestController
@RequestMapping("/shopping_mall/activities")
public class ActivitiesController {

    @Autowired
    private ActivitiesMapper activitiesMapper;

    @Autowired
    private IActivitiesService iActivitiesService;

    @RequestMapping("/queryActiviries")
    public List<Activities> queryActiviries(String skid){
        System.out.println(skid);
        return activitiesMapper.queryActiviries(Integer.valueOf(skid));
    }

    @RequestMapping("/querylist")
    public List<Activities> querylist(){
        return iActivitiesService.list();
    }

    @RequestMapping("/updatestate")
    public Integer updatestate(Activities activities){
        iActivitiesService.updateById(activities);
        return 200;
    }

    @RequestMapping("/deleteById")
    public Integer deleteById(Integer asid){
        iActivitiesService.removeById(asid);
        return 200;
    }

    @RequestMapping("/add")
    public Integer add(Activities activities){
System.out.println(activities.getAsksdatetime());
        iActivitiesService.save(activities);
        return 200;
    }

    @RequestMapping("/updateactivities")
    public Integer updateactivities(Activities activities){
        System.out.println(activities.toString()+"ashdfjhsadkjhfjkhasdkjfhkjas");

        iActivitiesService.updateById(activities);
        return 200;
    }

    @RequestMapping("/querybyid")
    public Activities querybyid(Integer asid){
        System.out.println(asid+"hdasjhfkjsdhakjfhkjasdhkjfhkjasdhfkjhkj");
        return iActivitiesService.getById(asid);
    }


}
