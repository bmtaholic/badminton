package com.bmtaholic.badminton.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bmtaholic.badminton.entity.Book;

public interface BookMapper {
	int deleteByPrimaryKey(String bookId);

	int insert(Book record);

	int insert4list(List<Book> record);

	int insertSelective(Book record);

	Book selectByPrimaryKey(String bookId);

	int updateByPrimaryKeySelective(Book record);

	int updateByPrimaryKey(Book record);

	List<Book> queryList(Book params);

	List<Book> selectByPhone(String phone);
}