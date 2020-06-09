package com.huayu.shopping_mall.web;

import com.huayu.shopping_mall.entity.Seckill;
import com.huayu.shopping_mall.service.ISeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/shopping_mall/seckill")
@CrossOrigin
public class SeckillController {

    @Autowired
    private ISeckillService iSeckillService;

    @RequestMapping("/queryList")
    @ResponseBody
    public List<Seckill> queryList(Seckill seckill){
       System.out.println(seckill.toString());
        return iSeckillService.queryLikeSeckill(seckill);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public Integer deleteById(String skid){
//        iSeckillService.deleteById(skid);
        return 200;
    }

    @RequestMapping("/seckillAdd")
    @ResponseBody
    public Integer seckillAdd(Seckill seckill){
    System.out.println(seckill.toString()+"123132132123132132132123132132132132");
    iSeckillService.save(seckill);
        return 200;
    }

    @RequestMapping("/selectSeckillById")
    @ResponseBody
    public Seckill selectSeckillById(Integer skid){
        return iSeckillService.getById(skid);
    }

    @RequestMapping("/updateSeckill")
    @ResponseBody
    public Integer updateSeckill(Seckill seckill){
        iSeckillService.updateById(seckill);
        return 200;

    }


}
