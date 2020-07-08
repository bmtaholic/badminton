package com.bmtaholic.badminton.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.UserInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.customer.ULoginRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户登录管理")
@RequestMapping(value = "/user/auth")
@RestController
public class UAuthController {
	@Autowired
	UserService userService;

	@PostMapping(value = "/login")
	@ApiOperation(value = "用户登录")
	public BaseResponse userLogin(@RequestBody BaseRequest<ULoginRequest> request) {
		BaseResponse response = new BaseResponse();
		String phone = request.getParams().getPhone();
		String password = request.getParams().getPassword();
		String result = userService.userLogin(phone, password);
		if ("".equals(result)) {
			response.setErrCode(ResponseCode.BIZ_LOGINERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_LOGINERR.getDesc());
		}
		response.setResult(result);
		return response;
	}
}
