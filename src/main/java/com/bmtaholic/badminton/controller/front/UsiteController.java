package com.bmtaholic.badminton.controller.front;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.info.SiteInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.customer.UQuerySiteRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.customer.UQuerySiteResponse;
import com.bmtaholic.badminton.pojo.response.item.SiteItem;
import com.bmtaholic.badminton.service.SiteService;
import com.bmtaholic.badminton.utils.ListUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户球场管理")
@RequestMapping(value = "/user/site")
@RestController
public class UsiteController {
	@Autowired
	SiteService siteService;

	@PostMapping(value = "/query")
	@ApiOperation(value = "用户查询球场")
	public BaseResponse<UQuerySiteResponse> querySite(@RequestBody BaseRequest<UQuerySiteRequest> request) {
		BaseResponse response = new BaseResponse();
		List<SiteInfo> siteInfoList = siteService.querySiteList(request.getParams().getGymId());
		List<SiteItem> list = ListUtil.copyToStringList(siteInfoList, SiteItem.class);
		response.setResult(list);
		return response;
	}
}
