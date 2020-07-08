package com.bmtaholic.badminton.service;

import com.bmtaholic.badminton.pojo.info.UserGymRelInfo;

public interface UserGymRelService {
	UserGymRelInfo queryUserGymInfo(String userId, int gymId);

	int addUser(UserGymRelInfo uInfo);
}
