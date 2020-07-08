package com.bmtaholic.badminton.pojo.request.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户订单查询请求")
public class UQueryOrderRequest {
	@ApiModelProperty(value = "手机号")
	private String phone;
}
