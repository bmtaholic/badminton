package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "添加用户请求")
public class AddUserRequest {
	@ApiModelProperty(value = " 名字")
	private String name;

	@ApiModelProperty(value = "手机号")
	private String phone;

	@ApiModelProperty(value = "密码")
	private String password;
}
