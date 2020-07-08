package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data
public class OrderInfo {
	/**
	 * 订单号
	 */
	private String orderId;

	/**
	 * 用户编号
	 */
	private String userId;

	/**
	 * 球馆编号
	 */
	private Integer gymnasiumId;

	/**
	 * 场地编号
	 */
	private String siteNo;

	/**
	 * 开始时间
	 */
	private String startTime;

	/**
	 * 结束时间
	 */
	private String stopTime;

	/**
	 * 手机号
	 */
	private String phone;
}
