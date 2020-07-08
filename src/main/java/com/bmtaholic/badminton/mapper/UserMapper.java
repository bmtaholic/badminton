package com.bmtaholic.badminton.mapper;

import com.bmtaholic.badminton.entity.User;

public interface UserMapper {
	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	User selectByPhone(String phone);

	User checkUserLogin(String phone);
}