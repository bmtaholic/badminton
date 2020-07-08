package com.bmtaholic.badminton.pojo.response.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "消费查询返回")
public class QueryConsumeResponse {
	
	@ApiModelProperty(value = "订单编号")
	private String orderId;

	@ApiModelProperty(value = "用户编号")
	private String userId;

	@ApiModelProperty(value = "消费时间")
	private String consumeTime;

	@ApiModelProperty(value = "消费方式")
	private String consumeType;

	@ApiModelProperty(value = "消费金额")
	private String consumeMoney;

	@ApiModelProperty(value = "余额")
	private String balance;

}
