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
import com.bmtaholic.badminton.pojo.info.BookOrderRelInfo;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.request.BaseRequest;
import com.bmtaholic.badminton.pojo.request.admin.AddBookRequest;
import com.bmtaholic.badminton.pojo.request.admin.QueryBookRequest;
import com.bmtaholic.badminton.pojo.request.customer.UQueryBookRequest;
import com.bmtaholic.badminton.pojo.request.item.BookItem;
import com.bmtaholic.badminton.pojo.response.BaseResponse;
import com.bmtaholic.badminton.pojo.response.admin.QueryBookResponse;
import com.bmtaholic.badminton.pojo.response.customer.UQueryBookResponse;
import com.bmtaholic.badminton.service.AuthService;
import com.bmtaholic.badminton.service.BookOrderRelService;
import com.bmtaholic.badminton.service.BookService;
import com.bmtaholic.badminton.utils.ListUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/admin/book")
@Api(tags = "预定管理")
public class BookController {
	@Autowired
	BookService bookService;

	@Autowired
	AuthService authService;

	@Autowired
	BookOrderRelService bookOrderRelService;

	@PostMapping(value = "/add")
	@ApiOperation(value = "添加预定信息")
	public BaseResponse book(@RequestBody BaseRequest<AddBookRequest> request) {
		BaseResponse response = new BaseResponse();
		SessionInfo sInfo = authService.querySessionInfoByToken(request.getToken());
		List<BookInfo> infoList = ListUtil.copyList(request.getParams().getList(), BookInfo.class);
		int result = bookService.addBook(sInfo.getGymId(), infoList);
		if (result < 0) {
			response.setErrCode(ResponseCode.BIZ_ADDBOOKERR.getCode());
			response.setErrMsg(ResponseCode.BIZ_ADDBOOKERR.getDesc());
		}
		return response;
	}

	@PostMapping(value = "/query")
	@ApiOperation(value = "查询预定信息")
	public BaseResponse<QueryBookResponse> queryBook(@RequestBody BaseRequest<QueryBookRequest> request) {
		BaseResponse response = new BaseResponse();
		SessionInfo sessionInfo = authService.querySessionInfoByToken(request.getToken());
		List<BookInfo> bookInfoList = bookService.queryBookList(sessionInfo.getGymId(), request.getParams().getDate());
		List<BookItem> list = ListUtil.copyToStringList(bookInfoList, BookItem.class);
		response.setResult(list);
		return response;
	}

}
