package com.bmtaholic.badminton.controller.afterend;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.BookInfo;
import com.bmtaholic.badminton.pojo.info.OrderInfo;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.QueryOrderRequest;
import com.bmtaholic.badminton.pojo.request.item.BookItem;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.admin.QueryOrderResponse;
import com.bmtaholic.badminton.pojo.response.item.OrderItem;
import com.bmtaholic.badminton.service.AuthService;
import com.bmtaholic.badminton.service.OrderService;
import com.bmtaholic.badminton.utils.ListUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/admin/order")
@Api(tags = "订单管理")
public class OrderController {
	@Autowired
	OrderService orderService;

	@Autowired
	AuthService authService;

	@PostMapping(value = "/query")
	@ApiOperation(value = "订单查询")
	public BaseResponse<QueryOrderResponse> queryOrder(@RequestBody BaseRequest<QueryOrderRequest> request) {
		BaseResponse response = new BaseResponse();
		List<BookInfo> bookInfoList = orderService.queryByPhone(request.getParams().getPhone());
		List<OrderItem> list = ListUtil.copyToStringList(bookInfoList, OrderItem.class);
		response.setResult(list);
		return response;
	}
}
