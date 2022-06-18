package com.guigu.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
