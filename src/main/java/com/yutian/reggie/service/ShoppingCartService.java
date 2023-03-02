package com.yutian.reggie.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yutian.reggie.common.R;
import com.yutian.reggie.entity.ShoppingCart;

public interface ShoppingCartService extends IService<ShoppingCart> {

    void clean();
}
