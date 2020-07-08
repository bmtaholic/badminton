package com.bmtaholic.badminton.pojo.info;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class UserGymRelInfo {
	/**
	 * 用户编号
	 */
	private String userId;

	/**
	 * 球馆编号
	 */
	private Integer gymId;

	/**
	 * 是否VIP
	 */
	private Integer isVip;

	/**
	 * 加入球馆时间
	 */
	private String createdAt;

	/**
	 * 最后消费时间
	 */
	private String latestConsume;

	/**
	 * 积分
	 */
	private Integer integration;

	/**
	 * 余额
	 */
	private BigDecimal balance;
}
