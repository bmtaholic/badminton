package com.bmtaholic.badminton.mapper;

import com.bmtaholic.badminton.entity.Consume;

public interface ConsumeMapper {
	int insert(Consume record);

	int insertSelective(Consume record);

	Consume queryByPhone(String phone);
}