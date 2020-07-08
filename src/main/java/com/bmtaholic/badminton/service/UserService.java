package com.bmtaholic.badminton.service;

import com.bmtaholic.badminton.pojo.info.UserInfo;

public interface UserService {
	public UserInfo queryInfoByPhone(String phone);

	String addUser(UserInfo info);

	int registeredUser(UserInfo info);

	String userLogin(String phone, String password);
}
