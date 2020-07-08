package com.bmtaholic.badminton.pojo.response.admin;

import java.util.List;

import com.bmtaholic.badminton.pojo.request.item.BookItem;
import com.bmtaholic.badminton.pojo.response.item.OrderItem;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "订单查询返回")
public class QueryOrderResponse {
	List<OrderItem> list;
}
