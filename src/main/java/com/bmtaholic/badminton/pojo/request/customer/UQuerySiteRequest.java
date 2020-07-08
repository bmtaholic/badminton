package com.bmtaholic.badminton.pojo.request.customer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UQuerySiteRequest {
	@ApiModelProperty(value = "球馆id")
	private int gymId;
}
