package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data
public class UserInfo {
	/**
	 * 用户编号 UUID
	 */
	private String userId;

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 状态
	 */
	private int status;

	/**
	 * 注册时间
	 */
	private String createdAt;

	/**
	 * 最后登录时间
	 */
	private String lastLogin;

}
