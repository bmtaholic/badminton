package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data

public class ConsumeInfo {
	/**
	 * 手机号
	 */
	private Integer phone;

	/**
	 * 消费时间
	 */
	private String consumeTime;

	/**
	 * 消费金额
	 */
	private String consumeMoney;

	/**
	 * 消费类型
	 */
	private String consumeType;

	/**
	 * 余额
	 */
	private String balance;
	/**
	 * 姓名
	 */
	private String name;
}
