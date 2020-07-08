package com.bmtaholic.badminton.entity;

import java.io.Serializable;

/**
 * order
 * 
 * @author
 */
public class Order implements Serializable {
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

	private static final long serialVersionUID = 1L;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getGymnasiumId() {
		return gymnasiumId;
	}

	public void setGymnasiumId(Integer gymnasiumId) {
		this.gymnasiumId = gymnasiumId;
	}

	public String getSiteNo() {
		return siteNo;
	}

	public void setSiteNo(String siteNo) {
		this.siteNo = siteNo;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}