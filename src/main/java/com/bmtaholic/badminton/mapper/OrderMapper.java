package com.bmtaholic.badminton.mapper;

import java.util.List;

import com.bmtaholic.badminton.entity.Order;

public interface OrderMapper {
	int deleteByPrimaryKey(String orderId);

	int insert(Order record);

	int insertSelective(Order record);

	Order selectByPrimaryKey(String orderId);

	int updateByPrimaryKeySelective(Order record);

	int updateByPrimaryKey(Order record);

	List<Order> selectByPhone(String phone);
}