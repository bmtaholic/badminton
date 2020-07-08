package com.bmtaholic.badminton.controller.afterend;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.ConsumeInfo;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.QueryConsumeRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.admin.QueryConsumeResponse;
import com.bmtaholic.badminton.service.AuthService;
import com.bmtaholic.badminton.service.ConsumeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(tags = "消费管理")
@RequestMapping(value = "/admin/consume")
@RestController
@Slf4j
public class ConsumeController {
	@Autowired
	AuthService authService;
	@Autowired
	ConsumeService consumeService;

	@PostMapping(value = "/query")
	@ApiOperation(value = "查询消费")
	public BaseResponse<QueryConsumeResponse> queryConsume(@RequestBody BaseRequest<QueryConsumeRequest> request) {
		BaseResponse<QueryConsumeResponse> response = new BaseResponse<QueryConsumeResponse>();
		SessionInfo sInfo = authService.querySessionInfoByToken(request.getToken());
		ConsumeInfo info = consumeService.queryByPhone(request.getParams().getPhone());
		if (info != null) {
			log.debug("queryConsume:" + info.getName());
			QueryConsumeResponse result = new QueryConsumeResponse();
			BeanUtils.copyProperties(info, result);
			response.setResult(result);
		} else {
			log.debug("queryConsume: null");
			response.setErrCode(ResponseCode.BIZ_NOINFOERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_NOINFOERR.getDesc());
		}

		return response;
	}

}
