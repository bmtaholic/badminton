package com.bmtaholic.badminton.pojo.request.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="查询预订信息请求")
public class QueryBookRequest {
	@ApiModelProperty(value = "日期")
	private String date;
}
