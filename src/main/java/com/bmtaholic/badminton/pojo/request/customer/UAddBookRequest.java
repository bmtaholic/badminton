package com.bmtaholic.badminton.pojo.request.customer;

import java.util.List;
import com.bmtaholic.badminton.pojo.request.item.BookItem;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "添加预定信息请求")
public class UAddBookRequest {
	private List<BookItem> list;
	
	private int gymId;
}
