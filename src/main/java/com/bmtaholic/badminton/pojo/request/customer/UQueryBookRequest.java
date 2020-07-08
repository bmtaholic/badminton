package com.bmtaholic.badminton.pojo.request.customer;

import com.bmtaholic.badminton.pojo.request.admin.QueryBookRequest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
@ApiModel(value="用户查询预订信息请求")
public class UQueryBookRequest {
	@ApiModelProperty(value = "日期")
	private String date;
	
	@ApiModelProperty(value = "球馆id")
	private int gymId;
}
