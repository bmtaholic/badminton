package com.bmtaholic.badminton.mapper;

import com.bmtaholic.badminton.entity.Admin;

public interface AdminMapper {
	int deleteByPrimaryKey(Integer adminId);

	int insert(Admin record);

	int insertSelective(Admin record);

	Admin selectByPrimaryKey(Integer adminId);

	int updateByPrimaryKeySelective(Admin record);

	int updateByPrimaryKey(Admin record);

	Admin checkLogin(String phone);
}