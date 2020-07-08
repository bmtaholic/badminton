package com.bmtaholic.badminton.pojo.response;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "基本响应")
@Data
public class PageResponse<T> {
	@ApiModelProperty(value = "错误码")
	private String errCode = ResponseCode.SUCCESS.getCode();

	@ApiModelProperty(value = "错误信息")
	private String errMsg = ResponseCode.SUCCESS.getDesc();

	@ApiModelProperty(value = "分页结果")
	private PageInfo<T> result;
}
