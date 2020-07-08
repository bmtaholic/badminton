package com.bmtaholic.badminton.pojo.request.item;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BookItem {
	@ApiModelProperty(value = "开始时间")
	private String startTime;
	
	@ApiModelProperty(value = "结束时间")
	private String endTime;
	
	@ApiModelProperty(value = "场地编号")
	private String siteNo;
	
	@ApiModelProperty(value = "手机号")
	private String phone;
	
	@ApiModelProperty(value = "球馆")
	private int gymnasiumId;
}
