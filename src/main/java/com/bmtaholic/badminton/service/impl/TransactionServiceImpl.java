package com.bmtaholic.badminton.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.TransactionHistory;
import com.bmtaholic.badminton.entity.UserGymRel;
import com.bmtaholic.badminton.mapper.TransactionHistoryMapper;
import com.bmtaholic.badminton.mapper.UserGymRelMapper;
import com.bmtaholic.badminton.pojo.info.RechargeInfo;
import com.bmtaholic.badminton.service.TransactionService;
import com.bmtaholic.badminton.utils.DateUtils;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionHistoryMapper transactionHistoryMapper;

	@Autowired
	UserGymRelMapper userGymRelMapper;

	@Override
	public Boolean rechargeByAdmin(RechargeInfo info) {
		// 记录结果
		String now = DateUtils.getToday4yyyyMMddHHmmss();
		TransactionHistory transactionHistory = new TransactionHistory();
		BeanUtils.copyProperties(info, transactionHistory);
		transactionHistory.setCreatedAt(now);
		transactionHistory.setType(1);
		transactionHistoryMapper.insertSelective(transactionHistory);

		String userId = info.getUserId();
		UserGymRel userGymRel = new UserGymRel();
		userGymRel.setUserId(info.getUserId());
		userGymRel.setGymId(info.getGymId());
		userGymRel.setBalance(info.getSum());
		userGymRel.setLatestConsume(now);
		userGymRelMapper.updateBalanceAndIntegrationForRecharge(userGymRel);
		return true;
	}
}
