package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenle
 * @email chenle@gmail.com
 * @date 2022-08-30 14:21:30
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
