package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author nickzhang
 * @email nickzhangcs@gmail.com
 * @date 2026-02-10 18:18:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
