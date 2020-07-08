package com.bmtaholic.badminton.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.Consume;
import com.bmtaholic.badminton.mapper.ConsumeMapper;
import com.bmtaholic.badminton.pojo.info.ConsumeInfo;
import com.bmtaholic.badminton.service.ConsumeService;

@Service
public class ConsumeServiceImpl implements ConsumeService {

	@Autowired
	ConsumeMapper consumeMapper;

	@Override
	public ConsumeInfo queryByPhone(String phone) {
		Consume consume = consumeMapper.queryByPhone(phone);
		ConsumeInfo info = new ConsumeInfo();
		if(consume == null){
			return null;
		}
		BeanUtils.copyProperties(consume, info);
		return info;
	}

}
