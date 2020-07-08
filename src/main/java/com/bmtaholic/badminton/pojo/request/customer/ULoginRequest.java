package com.bmtaholic.badminton.pojo.request.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户登录请求")
public class ULoginRequest {
	@ApiModelProperty(value = "手机号")
	private String phone;
	@ApiModelProperty(value = "密码")
	private String password;
}
