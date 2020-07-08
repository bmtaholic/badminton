package com.bmtaholic.badminton.controller.front;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.info.GymInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.customer.QueryGymResponse;
import com.bmtaholic.badminton.pojo.response.item.GymItem;
import com.bmtaholic.badminton.service.GymService;
import com.bmtaholic.badminton.utils.ListUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/user/gym")
@Api(tags = "球馆选择管理")
public class GymController {
	@Autowired
	GymService gymService;

	@PostMapping(value = "/query")
	@ApiOperation(value = "球馆查询")
	public BaseResponse<QueryGymResponse> userQueryOrder(@RequestBody BaseRequest request) {
		BaseResponse response = new BaseResponse();
		List<GymInfo> infoList = gymService.queryGymList();
		List<GymItem> list = ListUtil.copyToStringList(infoList, GymItem.class);
		response.setResult(list);
		return response;
	}
}
