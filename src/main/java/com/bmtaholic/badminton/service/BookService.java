package com.bmtaholic.badminton.service;

import java.util.List;

import com.bmtaholic.badminton.pojo.info.BookInfo;

public interface BookService {
	int addBook(int gymId, List<BookInfo> infoList);

	int addUserBook(List<BookInfo> infoList);

	List<BookInfo> queryBookList(int gymId, String date);
}
