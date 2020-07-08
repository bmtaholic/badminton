package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data
public class SessionInfo {
	/**
	 * 管理员编号
	 */
	private int adminId;
	/**
	 * 管理员名字
	 */
	private String adminName;
	/**
	 * 球馆编号
	 */
	private int gymId;
	/**
	 * 球馆名字
	 */
	private String gymName;
	/**
	 * 有效期
	 */
	private int validity;
}
