package com.bmtaholic.badminton.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmtaholic.badminton.entity.Site;
import com.bmtaholic.badminton.mapper.SiteMapper;
import com.bmtaholic.badminton.pojo.info.SiteInfo;
import com.bmtaholic.badminton.service.SiteService;
import com.bmtaholic.badminton.utils.ListUtil;

@Service
public class SiteServiceImpl implements SiteService {
	@Autowired
	SiteMapper siteMapper;

	@Override
	public List<SiteInfo> querySiteList(int gymnasiumId) {
		Site site = new Site();
		site.getGymnasiumId();
		List<Site> siteList = siteMapper.queryListByGymnasiumId(gymnasiumId);
		List<SiteInfo> siteInfoList = ListUtil.copyList(siteList, SiteInfo.class);
		return siteInfoList;
	}

	@Override
	public int addSite(SiteInfo info) {
		Site site = new Site();
		BeanUtils.copyProperties(info, site);
		return siteMapper.insert(site);
	}

	@Override
	public int updateSite(int siteId, BigDecimal price, BigDecimal vipPrice, Integer status) {
		Site site = new Site();
		site.setSiteId(siteId);
		site.setPrice(price);
		site.setVipPrice(vipPrice);
		if(status != null) {
			site.setStatus(status);
		}
		return siteMapper.updateByPrimaryKeySelective(site);
	}

}
