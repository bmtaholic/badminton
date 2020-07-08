package com.bmtaholic.badminton.service;

import com.bmtaholic.badminton.pojo.info.SessionInfo;

public interface AuthService {
	SessionInfo querySessionInfoByToken(String token);

	/**
	 * 登录
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	boolean login(String phone, String password);
}
