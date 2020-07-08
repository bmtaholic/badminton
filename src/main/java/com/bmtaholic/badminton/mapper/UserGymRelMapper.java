package com.bmtaholic.badminton.mapper;

import com.bmtaholic.badminton.entity.UserGymRel;

public interface UserGymRelMapper {
	int insert(UserGymRel record);

	int insertSelective(UserGymRel record);

	UserGymRel selectByUserIdAndGymId(UserGymRel params);

	int updateBalanceAndIntegrationForRecharge(UserGymRel params);
}