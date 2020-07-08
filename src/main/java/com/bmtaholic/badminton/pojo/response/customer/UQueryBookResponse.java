package com.bmtaholic.badminton.pojo.response.customer;

import java.util.List;

import com.bmtaholic.badminton.pojo.request.item.BookItem;
import com.bmtaholic.badminton.pojo.response.admin.QueryBookResponse;

import lombok.Data;

@Data
public class UQueryBookResponse {
	List<BookItem> list;
}
