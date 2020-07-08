package com.bmtaholic.badminton.pojo.request.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户注册请求")
public class RegisteredRequest {
	@ApiModelProperty(value = "手机号")
	private String phone;

	@ApiModelProperty(value = "名字")
	private String name;

	@ApiModelProperty(value = "密码")
	private String password;

}
