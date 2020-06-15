package com.huayu.shopping_mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.shopping_mall.entity.Browse;
import com.huayu.shopping_mall.mapper.BrowseMapper;
import com.huayu.shopping_mall.service.IBrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mq
 * @since 2020-06-11
 */
@Service
public class BrowseServiceImpl extends ServiceImpl<BrowseMapper, Browse> implements IBrowseService {

    @Autowired
    BrowseMapper browseMapper;

    public Integer searchbrowse(String nb){
        return browseMapper.searchbrowse(nb);
    }

    public Integer ordersCount(String nb){
        return browseMapper.ordersCount(nb);
    }

    public Integer ordersCounts(String nb){
        return browseMapper.ordersCounts(nb);
    }

    public Integer sumofnumber(String nb){
        return browseMapper.sumofnumber(nb);
    }

}
