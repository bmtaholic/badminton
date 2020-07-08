package com.bmtaholic.badminton.mapper;

import java.util.List;

import com.bmtaholic.badminton.entity.Gymnasium;

public interface GymnasiumMapper {
	int deleteByPrimaryKey(Integer gymnasiumId);

	int insert(Gymnasium record);

	int insertSelective(Gymnasium record);

	Gymnasium selectByPrimaryKey(Integer gymnasiumId);

	int updateByPrimaryKeySelective(Gymnasium record);

	int updateByPrimaryKey(Gymnasium record);

	List<Gymnasium> queryList(Gymnasium gym);
}