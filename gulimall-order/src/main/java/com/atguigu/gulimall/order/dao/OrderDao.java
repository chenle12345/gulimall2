package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenle
 * @email chenle@gmail.com
 * @date 2022-08-30 14:35:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
