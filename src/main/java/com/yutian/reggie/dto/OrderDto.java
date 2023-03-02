package com.yutian.reggie.dto;


import com.yutian.reggie.entity.OrderDetail;
import com.yutian.reggie.entity.Orders;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;

}
