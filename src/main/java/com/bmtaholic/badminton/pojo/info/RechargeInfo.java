package com.bmtaholic.badminton.pojo.info;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RechargeInfo {

	/**
	 * 明细编号
	 */
	private Integer historyId;

	/**
	 * 用户编号
	 */
	private String userId;

	/**
	 * 球馆编号
	 */
	private int gymId;

	/**
	 * 交易类型 1：支出 2：充值
	 */
	private Integer type;

	/**
	 * 总金额
	 */
	private BigDecimal sum;

	/**
	 * 实际总金额
	 */
	private BigDecimal realSum;

	/**
	 * 交易时间
	 */
	private String createdAt;

	/**
	 * 备注
	 */
	private String remark;
}
