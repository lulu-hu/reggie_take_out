package com.guigu.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapoer extends BaseMapper<User> {
}
