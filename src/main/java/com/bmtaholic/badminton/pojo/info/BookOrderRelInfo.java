package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data
public class BookOrderRelInfo {
	/**
	 * 订单号
	 */
	private String bookId;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 场地编号
	 */
	private String siteno;

	/**
	 * 开始时间
	 */
	private String startTime;

	/**
	 * 结束时间
	 */
	private String stopTime;

}
