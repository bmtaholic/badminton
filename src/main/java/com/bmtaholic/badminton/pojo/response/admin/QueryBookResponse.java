package com.bmtaholic.badminton.pojo.response.admin;

import java.util.List;

import com.bmtaholic.badminton.pojo.request.item.BookItem;

import lombok.Data;

@Data
public class QueryBookResponse {
	List<BookItem> list;
}
