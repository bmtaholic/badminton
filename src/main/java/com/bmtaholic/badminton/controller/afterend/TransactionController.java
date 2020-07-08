package com.bmtaholic.badminton.controller.afterend;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.info.RechargeInfo;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.RechargeRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.service.AuthService;
import com.bmtaholic.badminton.service.TransactionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/admin/transaction")
@Api(tags = "充值管理")
public class TransactionController {
	@Autowired
	AuthService authService;
	@Autowired
	TransactionService transactionService;

	@PostMapping(value = "/recharge")
	@ApiOperation(value = "充值")
	public BaseResponse recharge(@RequestBody BaseRequest<RechargeRequest> request) {
		BaseResponse response = new BaseResponse();
		SessionInfo sInfo = authService.querySessionInfoByToken(request.getToken());
		RechargeRequest params = request.getParams();
		RechargeInfo info = new RechargeInfo();
		// 字符转金额
		info.setRealSum(new BigDecimal(params.getRealSum()));
		info.setSum(new BigDecimal(params.getSum()));
		info.setUserId(params.getUserId());
		info.setGymId(sInfo.getGymId());
		info.setRemark(String.format("%d-%s:充值：%s，实收:%s", sInfo.getAdminId(), sInfo.getAdminName(), params.getSum(),
				params.getRealSum()));
		transactionService.rechargeByAdmin(info);
		return response;
	}
}
