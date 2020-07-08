package com.bmtaholic.badminton.service;

import java.math.BigDecimal;
import java.util.List;

import com.bmtaholic.badminton.pojo.info.SiteInfo;

public interface SiteService {
	List<SiteInfo> querySiteList(int gymnasiumId);

	int addSite(SiteInfo info);

	int updateSite(int siteId, BigDecimal price, BigDecimal vipPrice, Integer status);
}
