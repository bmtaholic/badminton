package com.bmtaholic.badminton.pojo.info;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class SiteInfo {
	/**
	 * 球场标记
	 */
	private String siteNo;

	/**
	 * 球场编号
	 */
	private Integer siteId;

	/**
	 * 球馆编号
	 */
	private int gymnasiumId;

	/**
	 * 场地类型
	 */
	private Integer type;

	/**
	 * 普通价格
	 */
	private BigDecimal price;

	/**
	 * vip价格
	 */
	private BigDecimal vipPrice;

	/**
	 * 状态
	 */
	private Integer status;

}
