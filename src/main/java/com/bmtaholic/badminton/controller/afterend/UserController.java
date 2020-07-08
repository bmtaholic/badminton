package com.bmtaholic.badminton.controller.afterend;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.info.UserGymRelInfo;
import com.bmtaholic.badminton.pojo.info.UserInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.AddUserRequest;
import com.bmtaholic.badminton.pojo.request.admin.QueryUserRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.admin.QueryUserResponse;
import com.bmtaholic.badminton.service.AuthService;
import com.bmtaholic.badminton.service.UserGymRelService;
import com.bmtaholic.badminton.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/admin/user")
@Api(tags = "用户管理")
public class UserController {
	@Autowired
	AuthService authService;

	@Autowired
	UserService userService;
	
	@Autowired
	UserGymRelService userGymRelService;

	@PostMapping(value = "/query")
	@ApiOperation(value = "查询用户信息")
	public BaseResponse<QueryUserResponse> queryUser(@RequestBody BaseRequest<QueryUserRequest> request) {
		BaseResponse<QueryUserResponse> response = new BaseResponse<QueryUserResponse>();
		SessionInfo sInfo = authService.querySessionInfoByToken(request.getToken());
		UserInfo info = userService.queryInfoByPhone(request.getParams().getPhone());
		// 是否在平台注册
		if (info != null) {
			String userId = info.getUserId();
			UserGymRelInfo userGymRelInfo = userGymRelService.queryUserGymInfo(userId, sInfo.getGymId());
			// 是否已经加入球馆
			if (userGymRelInfo != null) {
				QueryUserResponse result = new QueryUserResponse();
				BeanUtils.copyProperties(userGymRelInfo, result);
				result.setName(info.getName());
				result.setPhone(info.getPhone());
				result.setBalance(userGymRelInfo.getBalance().toString());
				response.setResult(result);
			} else {
				response.setErrCode(ResponseCode.BIZ_NOJOINGYM.getCode());
				response.setErrMsg(ResponseCode.BIZ_NOJOINGYM.getDesc());
			}
		} else {
			response.setErrCode(ResponseCode.BIZ_NOREGISTER.getCode());
			response.setErrMsg(ResponseCode.BIZ_NOREGISTER.getDesc());
		}
		return response;
	}

	@PostMapping(value = "/add")
	@ApiOperation(value = "添加用户信息")
	public BaseResponse addUser(@RequestBody BaseRequest<AddUserRequest> request) {
		BaseResponse response = new BaseResponse();
		SessionInfo sInfo = authService.querySessionInfoByToken(request.getToken());		
		UserInfo info = new UserInfo();
		BeanUtils.copyProperties(request.getParams(), info);
		String userId = userService.addUser(info);
		if (userId == "") {
			response.setErrCode(ResponseCode.BIZ_ADDUSERERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_ADDUSERERR.getDesc());
		}else {
			// 加入球馆
			UserGymRelInfo uInfo=new UserGymRelInfo();
			uInfo.setUserId(userId);
			uInfo.setGymId(sInfo.getGymId());
			int res = userGymRelService.addUser(uInfo);
			if(res<1) {
				response.setErrCode(ResponseCode.BIZ_NOJOINGYM.getCode());
				response.setErrMsg(ResponseCode.BIZ_NOJOINGYM.getDesc());
			}
		}
		return response;
	}

}
