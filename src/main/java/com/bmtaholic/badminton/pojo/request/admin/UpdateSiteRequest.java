package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "更新球馆")
public class UpdateSiteRequest {
	@ApiModelProperty(value = "球场标记", required = true)
	private Integer siteId;

	@ApiModelProperty(value = "场地类型")
	private Integer type;

	@ApiModelProperty(value = "普通价格")
	private String price;

	@ApiModelProperty(value = "vip价格")
	private String vipPrice;

	@ApiModelProperty(value = "状态")
	private Integer status;
}
