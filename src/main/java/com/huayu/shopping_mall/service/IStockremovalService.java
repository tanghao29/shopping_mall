package com.huayu.shopping_mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.shopping_mall.entity.Stockremoval;
import com.huayu.shopping_mall.utils.RespPageBean;
import com.huayu.shopping_mall.vo.StockremovalVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
public interface IStockremovalService extends IService<Stockremoval> {

    /**
     * 分页查询退货列表
     * @param stockremovalVo
     * @return
     */
    RespPageBean getAllReturnGoods(StockremovalVo stockremovalVo);
}
