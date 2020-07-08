package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data
public class BookInfo {
	/**
	 * 预定编号 uuid
	 */
	private String bookId;

	/**
	 * 球馆id
	 */
	private int gymnasiumId;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 开始时间
	 */
	private String startTime;

	/**
	 * 结束时间
	 */
	private String endTime;

	/**
	 * 场地编号
	 */
	private String siteNo;

	/**
	 * 创建时间
	 */
	private String createAt;

}
