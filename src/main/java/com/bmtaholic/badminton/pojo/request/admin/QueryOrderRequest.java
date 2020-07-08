package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "订单查询请求")
public class QueryOrderRequest {
	@ApiModelProperty(value = "手机号")
	private String phone;
}
