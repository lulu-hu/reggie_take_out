package com.guigu.reggie.dto;

import com.guigu.reggie.entity.Setmeal;
import com.guigu.reggie.entity.SetmealDish;

import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
