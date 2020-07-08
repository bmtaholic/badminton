package com.bmtaholic.badminton.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.UserGymRel;
import com.bmtaholic.badminton.mapper.UserGymRelMapper;
import com.bmtaholic.badminton.pojo.info.UserGymRelInfo;
import com.bmtaholic.badminton.pojo.info.UserInfo;
import com.bmtaholic.badminton.service.UserGymRelService;
import com.bmtaholic.badminton.utils.DateUtils;

@Service
public class UserGymRelServiceImpl implements UserGymRelService {

	@Autowired
	UserGymRelMapper userGymRelMapper;

	@Override
	public UserGymRelInfo queryUserGymInfo(String userId, int gymId) {
		UserGymRel userGymRel = new UserGymRel();
		userGymRel.setGymId(gymId);
		userGymRel.setUserId(userId);
		userGymRel = userGymRelMapper.selectByUserIdAndGymId(userGymRel);
		UserGymRelInfo info = new UserGymRelInfo();
		if (userGymRel == null) {
			return null;
		}
		BeanUtils.copyProperties(userGymRel, info);
		return info;
	}

	@Override
	public int addUser(UserGymRelInfo uInfo) {
		UserGymRel userGymRel = new UserGymRel();
		userGymRel.setUserId(uInfo.getUserId());
		userGymRel.setGymId(uInfo.getGymId());
		userGymRel.setCreatedAt(DateUtils.getToday4yyyyMMddHHmmss());
		return userGymRelMapper.insertSelective(userGymRel);
	}

}
