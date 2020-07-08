package com.bmtaholic.badminton.pojo.response.item;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GymItem {
	@ApiModelProperty(value = "球馆id")
	private int gymId;

	@ApiModelProperty(value = "球馆名")
	private String name;

	@ApiModelProperty(value = "球馆城市")
	private String city;

	@ApiModelProperty(value = "地址")
	private String address;

	@ApiModelProperty(value = "经度")
	private String longitude;

	@ApiModelProperty(value = "纬度")
	private String latitude;

	@ApiModelProperty(value = "状态")
	private Integer status;

	@ApiModelProperty(value = "联系电话")
	private String tel;

	@ApiModelProperty(value = "开馆时间")
	private String openTime;

	@ApiModelProperty(value = "闭馆时间")
	private String closeTime;

	@ApiModelProperty(value = "简介")
	private String desc;

}
