package com.bmtaholic.badminton.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.Admin;
import com.bmtaholic.badminton.mapper.AdminMapper;
import com.bmtaholic.badminton.pojo.info.AdminInfo;
import com.bmtaholic.badminton.pojo.info.SessionInfo;
import com.bmtaholic.badminton.pojo.request.admin.LoginRequest;
import com.bmtaholic.badminton.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	AdminMapper adminMapper;

	@Override
	public SessionInfo querySessionInfoByToken(String token) {
		SessionInfo sInfo = new SessionInfo();
		if ("13100000000".equals(token)) {
			sInfo.setAdminId(1);
			sInfo.setAdminName("一号阿姨");
			sInfo.setGymId(1);
			sInfo.setGymName("飞帆");
			sInfo.setValidity(666666);
		} else if ("13200000000".equals(token)) {
			sInfo.setAdminId(2);
			sInfo.setAdminName("2号阿姨");
			sInfo.setGymId(2);
			sInfo.setGymName("飞翔");
			sInfo.setValidity(666666);
		}else if ("13300000000".equals(token)) {
			sInfo.setAdminId(3);
			sInfo.setAdminName("3号阿姨");
			sInfo.setGymId(3);
			sInfo.setGymName("宏宇");
			sInfo.setValidity(666666);
		}else {
			return null;
		}
		return sInfo;
	}

	@Override
	public boolean login(String phone, String password) {
		Admin admin = adminMapper.checkLogin(phone);
		if (admin == null) {
			return false;
		}
		if (admin.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

}
