package com.bmtaholic.badminton.pojo.request;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "分页服务请求")
public class PageRequest<T> implements Serializable {

	@ApiModelProperty(value = "令牌")
	private String token;

	@ApiModelProperty(value = "每页大小")
	private int pageSize = 10;

	@ApiModelProperty(value = "请求页数")
	private int page = 1;

	@ApiModelProperty(value = "请求参数")
	private T params;
}
