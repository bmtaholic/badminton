package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "充值请求")
public class RechargeRequest {
	@ApiModelProperty(value = "用户编号", required = true)
	private String userId;

	@ApiModelProperty(value = "总金额", required = true)
	private String sum;

	@ApiModelProperty(value = "实际总金额", required = true)
	private String realSum;
}
