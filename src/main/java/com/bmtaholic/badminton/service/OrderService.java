package com.bmtaholic.badminton.service;

import java.util.List;

import com.bmtaholic.badminton.pojo.info.BookInfo;
import com.bmtaholic.badminton.pojo.info.OrderInfo;

public interface OrderService {
	List<BookInfo> queryByPhone(String phone);
}
