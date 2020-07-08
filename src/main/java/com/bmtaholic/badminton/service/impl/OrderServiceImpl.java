package com.bmtaholic.badminton.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.Book;
import com.bmtaholic.badminton.entity.Order;
import com.bmtaholic.badminton.mapper.BookMapper;
import com.bmtaholic.badminton.mapper.OrderMapper;
import com.bmtaholic.badminton.pojo.info.BookInfo;
import com.bmtaholic.badminton.pojo.info.OrderInfo;
import com.bmtaholic.badminton.service.OrderService;
import com.bmtaholic.badminton.utils.ListUtil;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	BookMapper bookMapper;

	@Override
	public List<BookInfo> queryByPhone(String phone) {
		Book book = new Book();
		book.getPhone();
		List<Book> bookList = bookMapper.selectByPhone(phone);
		List<BookInfo> list = ListUtil.copyList(bookList, BookInfo.class);
		return list;
	}

}
