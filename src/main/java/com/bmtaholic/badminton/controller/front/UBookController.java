package com.bmtaholic.badminton.controller.front;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmtaholic.badminton.pojo.constant.ResponseCode;
import com.bmtaholic.badminton.pojo.info.BookInfo;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.QueryBookRequest;
import com.bmtaholic.badminton.pojo.request.customer.UAddBookRequest;
import com.bmtaholic.badminton.pojo.request.customer.UQueryBookRequest;
import com.bmtaholic.badminton.pojo.request.item.BookItem;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.admin.QueryBookResponse;
import com.bmtaholic.badminton.pojo.response.customer.UQueryBookResponse;
import com.bmtaholic.badminton.service.BookService;
import com.bmtaholic.badminton.utils.ListUtil;
import com.rabbitmq.client.RpcClient.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户预订管理")
@RequestMapping(value = "/user/book")
@RestController
public class UBookController {
	@Autowired
	BookService bookService;

	@PostMapping(value = "/add")
	@ApiOperation(value = "添加用户预订")
	public BaseResponse addUserBook(@RequestBody BaseRequest<UAddBookRequest> request) {
		BaseResponse response = new BaseResponse();
		List<BookInfo> infoList = ListUtil.copyList(request.getParams().getList(), BookInfo.class);
		int result = bookService.addBook(request.getParams().getGymId(), infoList);
		if (result != request.getParams().getList().size()) {
			response.setErrCode(ResponseCode.BIZ_ADDBOOKERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_ADDBOOKERR.getDesc());
		}
		return response;
	}

	@PostMapping(value = "/query")
	@ApiOperation(value = "用户查询预定信息")
	public BaseResponse<UQueryBookResponse> queryBook(@RequestBody BaseRequest<UQueryBookRequest> request) {
		BaseResponse response = new BaseResponse();
		List<BookInfo> bookInfoList = bookService.queryBookList(request.getParams().getGymId(), request.getParams().getDate());
		List<BookItem> list = ListUtil.copyToStringList(bookInfoList, BookItem.class);
		response.setResult(list);
		return response;
	}
}
