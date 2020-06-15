package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huayu.shopping_mall.entity.Stockremoval;
import com.huayu.shopping_mall.mapper.StockremovalMapper;
import com.huayu.shopping_mall.service.IStockremovalService;
import com.huayu.shopping_mall.utils.RespPageBean;
import com.huayu.shopping_mall.vo.StockremovalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mq
 * @since 2020-06-04
 */
@Service
public class StockremovalServiceImpl extends ServiceImpl<StockremovalMapper, Stockremoval> implements IStockremovalService {


    @Autowired
    StockremovalMapper stockremovalMapper;


    @Override
    public RespPageBean getAllReturnGoods(StockremovalVo stockremovalVo) {
//        Page<Object> pa = PageHelper.startPage(stockremovalVo.getPage(), stockremovalVo.getSize());
        List<Stockremoval> data = this.stockremovalMapper.getAllReturnGoods(stockremovalVo);

        RespPageBean bean = new RespPageBean();

        long total = data.size();
        bean.setTotal(total);
        bean.setData(data);

        return bean;
    }
}
