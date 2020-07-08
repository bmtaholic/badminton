package com.bmtaholic.badminton.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.BookOrderRel;
import com.bmtaholic.badminton.mapper.BookOrderRelMapper;
import com.bmtaholic.badminton.pojo.info.BookOrderRelInfo;
import com.bmtaholic.badminton.service.BookOrderRelService;

@Service
public class BookOrderRelServiceImpl implements BookOrderRelService {

	@Autowired
	BookOrderRelMapper bookOrderRelMapper;

	@Override
	public int addBook(BookOrderRelInfo bInfo) {
		BookOrderRel bookOrderRel = new BookOrderRel();
		bookOrderRel.setBookId(bInfo.getBookId());
		bookOrderRel.setPhone(bInfo.getPhone());
		bookOrderRel.setSiteno(bInfo.getSiteno());
		bookOrderRel.setStartTime(bInfo.getStartTime());
		bookOrderRel.setStopTime(bInfo.getStopTime());
		return bookOrderRelMapper.insertSelective(bookOrderRel);
	}

}
