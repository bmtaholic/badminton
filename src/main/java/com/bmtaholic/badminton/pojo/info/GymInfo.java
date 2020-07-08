package com.bmtaholic.badminton.pojo.info;

import lombok.Data;

@Data
public class GymInfo {
	/**
	 * 球馆编号
	 */
	private Integer gymnasiumId;

	/**
	 * 球馆名
	 */
	private String name;

	/**
	 * 城市编号
	 */
	private String city;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 经度
	 */
	private String longitude;

	/**
	 * 纬度
	 */
	private String latitude;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 联系电话
	 */
	private String tel;

	/**
	 * 开馆时间
	 */
	private String openTime;

	/**
	 * 闭馆时间
	 */
	private String closeTime;

	/**
	 * 简介
	 */
	private String desc;

}
