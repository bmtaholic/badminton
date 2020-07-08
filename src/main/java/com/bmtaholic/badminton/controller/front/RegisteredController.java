package com.bmtaholic.badminton.controller.front;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.UserInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.customer.RegisteredRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/user/registered")
@Api(tags = "用户注册管理")
public class RegisteredController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/add")
	@ApiOperation(value = "用户注册")
	public BaseResponse add(@RequestBody BaseRequest<RegisteredRequest> request) {
		BaseResponse response = new BaseResponse();
		UserInfo info = new UserInfo();
		BeanUtils.copyProperties(request.getParams(), info);
		int result = userService.registeredUser(info);
		if (result < 1) {
			response.setErrCode(ResponseCode.BIZ_REGISTEREDERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_REGISTEREDERR.getDesc());
		}
		return response;
	}
}
