package com.bmtaholic.badminton.controller.afterend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.AdminInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.LoginRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.service.AuthService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "登录管理")
@RequestMapping(value = "/admin/auth")
@RestController
public class AuthController {

	@Autowired
	AuthService authService;

	@PostMapping(value = "/login")
	@ApiOperation(value = "登录")
	public BaseResponse adminLogin(@RequestBody BaseRequest<LoginRequest> request) {
		BaseResponse response = new BaseResponse();
		String phone = request.getParams().getPhone();
		String password = request.getParams().getPassword();
		boolean result = authService.login(phone, password);
		if (!result) {
			response.setErrCode(ResponseCode.BIZ_LOGINERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_LOGINERR.getDesc());
		}
		return response;
	}
}
