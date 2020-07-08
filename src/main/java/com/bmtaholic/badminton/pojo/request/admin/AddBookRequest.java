package com.bmtaholic.badminton.pojo.request.admin;

import java.util.List;

import com.bmtaholic.badminton.pojo.request.item.BookItem;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "添加预定信息请求")
public class AddBookRequest {
	List<BookItem> list;
}
