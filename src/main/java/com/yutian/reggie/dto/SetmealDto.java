package com.yutian.reggie.dto;


import com.yutian.reggie.entity.Setmeal;
import com.yutian.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
