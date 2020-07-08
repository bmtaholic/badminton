package com.bmtaholic.badminton.pojo.request;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "请求")
public class BaseRequest<T> implements Serializable {
	@ApiModelProperty(value = "令牌")
	private String token;

	@ApiModelProperty(value = "请求参数")
	private T params;
}
