package com.bmtaholic.badminton.pojo.response.customer;

import java.util.List;

import com.bmtaholic.badminton.pojo.response.item.OrderItem;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户订单查询返回")
public class UQueryOrderResponse {
	List<OrderItem> list;
}
