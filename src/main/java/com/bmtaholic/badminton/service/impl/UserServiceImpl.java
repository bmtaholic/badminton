package com.bmtaholic.badminton.service.impl;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.User;
import com.bmtaholic.badminton.mapper.UserMapper;
import com.bmtaholic.badminton.pojo.info.UserInfo;
import com.bmtaholic.badminton.service.UserService;
import com.bmtaholic.badminton.utils.DateUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public UserInfo queryInfoByPhone(String phone) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPhone(phone);
		UserInfo info = new UserInfo();
		if (user == null) {
			return null;
		}
		BeanUtils.copyProperties(user, info);
		return info;
	}

	@Override
	public String addUser(UserInfo info) {
		User user = new User();
		BeanUtils.copyProperties(info, user);
		user.setStatus(1);
		user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setCreatedAt(DateUtils.getToday4yyyyMMddHHmmss());
		int res = userMapper.insertSelective(user);
		if (res > 0) {
			return user.getUserId();
		} else {
			return "";
		}
	}

	@Override
	public String userLogin(String phone, String password) {
		User user = userMapper.checkUserLogin(phone);
		if (password.equals(user.getPassword())) {
			return user.getUserId();
		}
		return "";
	}

	@Override
	public int registeredUser(UserInfo info) {
		User user = new User();
		BeanUtils.copyProperties(info, user);
		user.setStatus(1);
		user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setCreatedAt(DateUtils.getToday4yyyyMMddHHmmss());
		return userMapper.insertSelective(user);
	}
}
