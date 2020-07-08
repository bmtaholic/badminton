package com.bmtaholic.badminton.mapper;

import java.util.List;

import com.bmtaholic.badminton.entity.Site;

public interface SiteMapper {
	int deleteByPrimaryKey(Integer siteId);

	int insert(Site record);

	int insertSelective(Site record);

	Site selectByPrimaryKey(Integer siteId);

	int updateByPrimaryKeySelective(Site record);

	int updateByPrimaryKey(Site record);

	List<Site> queryListByGymnasiumId(Integer gymnasiumId);

	List<Site> queryList(Integer siteId);
}