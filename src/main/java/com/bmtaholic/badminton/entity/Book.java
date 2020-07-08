package com.bmtaholic.badminton.entity;

import java.io.Serializable;

/**
 * book
 * 
 * @author
 */
public class Book implements Serializable {
	/**
	 * 预定编号 uuid
	 */
	private String bookId;

	/**
	 * 球馆id
	 */
	private Integer gymId;

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

	private static final long serialVersionUID = 1L;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Integer getGymId() {
		return gymId;
	}

	public void setGymId(Integer gymId) {
		this.gymId = gymId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSiteNo() {
		return siteNo;
	}

	public void setSiteNo(String siteNo) {
		this.siteNo = siteNo;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
}