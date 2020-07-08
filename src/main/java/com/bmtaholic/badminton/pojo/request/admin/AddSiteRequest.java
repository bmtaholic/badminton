package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "添加场地信息")
public class AddSiteRequest {
	@ApiModelProperty(value = "球场标记", required = true)
	private String siteNo;

	@ApiModelProperty(value = "场地类型", required = true)
	private Integer type;

	@ApiModelProperty(value = "普通价格", required = true)
	private String price;

	@ApiModelProperty(value = "vip价格", required = true)
	private String vipPrice;

	@ApiModelProperty(value = "状态", required = true)
	private Integer status;
}
