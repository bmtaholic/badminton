package com.bmtaholic.badminton.mapper;

import com.bmtaholic.badminton.entity.TransactionHistory;

public interface TransactionHistoryMapper {
    int deleteByPrimaryKey(Integer historyId);

    int insert(TransactionHistory record);

    int insertSelective(TransactionHistory record);

    TransactionHistory selectByPrimaryKey(Integer historyId);

    int updateByPrimaryKeySelective(TransactionHistory record);

    int updateByPrimaryKey(TransactionHistory record);
}