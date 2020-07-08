package com.bmtaholic.badminton.pojo.response.item;

import lombok.Data;

@Data
public class SiteItem {

	/**
	 * 球场编号
	 */
	private Integer siteId;

	/**
	 * 球馆编号
	 */
	private int gymnasiumId;

	/**
	 * 球场标记
	 */
	private String siteNo;

	/**
	 * 场地类型
	 */
	private Integer type;

	/**
	 * 普通价格
	 */
	private String price;

	/**
	 * vip价格
	 */
	private String vipPrice;

	/**
	 * 状态
	 */
	private Integer status;
}
