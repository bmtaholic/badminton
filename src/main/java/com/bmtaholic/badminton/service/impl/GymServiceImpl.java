package com.bmtaholic.badminton.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.Gymnasium;
import com.bmtaholic.badminton.mapper.GymnasiumMapper;
import com.bmtaholic.badminton.pojo.info.GymInfo;
import com.bmtaholic.badminton.service.GymService;
import com.bmtaholic.badminton.utils.ListUtil;

@Service
public class GymServiceImpl implements GymService {

	@Autowired
	GymnasiumMapper gymnasiumMapper;

	@Override
	public List<GymInfo> queryGymList() {
		Gymnasium gym = new Gymnasium();
		gym.setGymnasiumId(1);
		List<Gymnasium> gymList = gymnasiumMapper.queryList(gym);
		List<GymInfo> gymInfoList = ListUtil.copyList(gymList, GymInfo.class);
		return gymInfoList;
	}

}
