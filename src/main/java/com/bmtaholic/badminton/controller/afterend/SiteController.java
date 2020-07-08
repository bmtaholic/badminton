package com.bmtaholic.badminton.controller.afterend;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.info.SiteInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.AddSiteRequest;
import com.bmtaholic.badminton.pojo.request.admin.UpdateSiteRequest;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.admin.QuerySiteResponse;
import com.bmtaholic.badminton.pojo.response.item.SiteItem;
import com.bmtaholic.badminton.service.AuthService;
import com.bmtaholic.badminton.service.SiteService;
import com.bmtaholic.badminton.utils.ListUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "球馆管理")
@RequestMapping(value = "/admin/site")
@RestController
public class SiteController {
	@Autowired
	AuthService authService;

	@Autowired
	SiteService siteService;

	@PostMapping(value = "/query")
	@ApiOperation(value = "查询球场")
	public BaseResponse<QuerySiteResponse> querySite(@RequestBody BaseRequest request) {
		BaseResponse response = new BaseResponse();
		SessionInfo sessionInfo = authService.querySessionInfoByToken(request.getToken());
		List<SiteInfo> siteInfoList = siteService.querySiteList(sessionInfo.getGymId());
		List<SiteItem> list = ListUtil.copyToStringList(siteInfoList, SiteItem.class);
		response.setResult(list);
		return response;
	}

	@PostMapping(value = "/add")
	@ApiOperation(value = "新增球场")
	public BaseResponse addSite(@RequestBody BaseRequest<AddSiteRequest> request) {
		BaseResponse response = new BaseResponse();
		SessionInfo sInfo = authService.querySessionInfoByToken(request.getToken());
		SiteInfo info = new SiteInfo();
		BeanUtils.copyProperties(request.getParams(), info);
		info.setGymnasiumId(sInfo.getGymId());
		info.setPrice(new BigDecimal(request.getParams().getPrice()));
		info.setVipPrice(new BigDecimal(request.getParams().getVipPrice()));
		int res = siteService.addSite(info);
		if (res < 1) {
			response.setErrCode(ResponseCode.BIZ_ADDSITEERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_ADDSITEERR.getDesc());
		}
		return response;
	}

	@PostMapping(value = "/update")
	@ApiOperation(value = "更新球场信息")
	public BaseResponse updateSite(@RequestBody BaseRequest<UpdateSiteRequest> requset) {
		BaseResponse response = new BaseResponse();
		SiteInfo info = new SiteInfo();
		UpdateSiteRequest params = requset.getParams();

		BigDecimal price = null;
		BigDecimal vipPrice = null;

		if (params.getPrice() != null) {
			price = new BigDecimal(params.getPrice());
		}
		if (params.getVipPrice() != null) {
			vipPrice = new BigDecimal(params.getVipPrice());
		}
		int res = siteService.updateSite(params.getSiteId(), price, vipPrice, params.getStatus());
		return response;
	}

}
