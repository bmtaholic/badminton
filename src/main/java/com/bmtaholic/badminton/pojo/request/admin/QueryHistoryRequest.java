package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryHistoryRequest {
	@ApiModelProperty(value = "手机号")
	private String phone;
	@ApiModelProperty(value = "开始日期")
	private String beginDate;
	@ApiModelProperty(value = "结束日期")
	private String endDate;
	@ApiModelProperty(value = "类型")
	private int type;
}
