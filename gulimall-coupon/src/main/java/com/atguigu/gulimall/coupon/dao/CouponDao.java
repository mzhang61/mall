package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author nickzhang
 * @email nickzhangcs@gmail.com
 * @date 2026-02-10 17:22:10
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
