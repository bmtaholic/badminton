package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "消费查询请求")
public class QueryConsumeRequest {
	@ApiModelProperty(value = "手机号", required = true)
	private String phone;
}
