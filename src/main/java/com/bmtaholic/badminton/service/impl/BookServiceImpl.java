package com.bmtaholic.badminton.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmtaholic.badminton.entity.Book;
import com.bmtaholic.badminton.entity.BookOrderRel;
import com.bmtaholic.badminton.entity.Site;
import com.bmtaholic.badminton.mapper.BookMapper;
import com.bmtaholic.badminton.mapper.BookOrderRelMapper;
import com.bmtaholic.badminton.pojo.info.BookInfo;
import com.bmtaholic.badminton.pojo.info.BookOrderRelInfo;
import com.bmtaholic.badminton.pojo.info.SiteInfo;
import com.bmtaholic.badminton.service.BookService;
import com.bmtaholic.badminton.utils.DateUtils;
import com.bmtaholic.badminton.utils.ListUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
	@Autowired
	BookMapper bookMapper;

	@Override
	@Transactional
	public int addBook(int gymId, List<BookInfo> infoList) {
		log.debug("service:addBook");
		List<Book> bookList = ListUtil.copyList(infoList, Book.class);
		String now = DateUtils.getToday4yyyyMMddHHmmss();

//		for(int i = 0; i< bookList.size(); i++) {
//			Book book = bookList.get(i);
//			book.setBookId(UUID.randomUUID().toString().replaceAll("-", ""));
//			book.setCreateAt(now);
//			book.setGymId(gymId);
//		}
		for (Book book : bookList) {
			book.setBookId(UUID.randomUUID().toString().replaceAll("-", ""));
			book.setCreateAt(now);
			book.setGymId(gymId);
		}
		return bookMapper.insert4list(bookList);
	}

	@Override
	public List<BookInfo> queryBookList(int gymId, String date) {
		Book params = new Book();
		params.setStartTime(date + "000000");
		params.setEndTime(date + "235959");
		params.setGymId(gymId);
		List<Book> bookList = bookMapper.queryList(params);
		List<BookInfo> resList = ListUtil.copyList(bookList, BookInfo.class);
		return resList;
	}

	@Override
	public int addUserBook(List<BookInfo> infoList) {
		List<Book> bookList = ListUtil.copyList(infoList, Book.class);
		String now = DateUtils.getToday4yyyyMMddHHmmss();
		for (Book book : bookList) {
			book.setBookId(UUID.randomUUID().toString().replaceAll("-", ""));
			book.setCreateAt(now);
		}
		return bookMapper.insert4list(bookList);
	}

}
