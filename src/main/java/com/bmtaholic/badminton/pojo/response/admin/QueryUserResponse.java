package com.bmtaholic.badminton.pojo.response.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "查询用户信息返回")
public class QueryUserResponse {
	@ApiModelProperty(value = "用户编号 UUID")
	private String userId;

	@ApiModelProperty(value = " 名字")
	private String name;

	@ApiModelProperty(value = "手机号")
	private String phone;

	@ApiModelProperty(value = "是否VIP")
	private Integer isVip;

	@ApiModelProperty(value = "加入球馆时间")
	private String createdAt;

	@ApiModelProperty(value = "最后消费时间")
	private String latestConsume;

	@ApiModelProperty(value = "积分")
	private Integer integration;

	@ApiModelProperty(value = "余额")
	private String balance;

}
