package com.huayu.shopping_mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.shopping_mall.entity.Commodityentry;
import com.huayu.shopping_mall.utils.RespPageBean;

import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public interface ICommodityentryService extends IService<Commodityentry> {

    /**
     * 分页查询入库列表
     * @param page
     * @param size
     * @param commodityentry
     * @param beginDate
     * @return
     */
    RespPageBean getAllGoodInByPage(Integer page, Integer size, Commodityentry commodityentry, Date[] beginDate);
}
