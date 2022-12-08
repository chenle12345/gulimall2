package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author chenle
 * @email chenle@gmail.com
 * @date 2022-08-29 10:45:01
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
