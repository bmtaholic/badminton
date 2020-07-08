package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data
public class AdminInfo {
	/**
	 * 管理员编号
	 */
	private Integer adminId;

	/**
	 * 球场编号
	 */
	private Integer gymnasiumId;

	/**
	 * 账号
	 */
	private String account;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 状态
	 */
	private Integer status;
}
