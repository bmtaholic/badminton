package com.bmtaholic.badminton.entity;

import java.io.Serializable;

/**
 * book_order_rel
 * @author 
 */
public class BookOrderRel implements Serializable {
    /**
     * 订单号
     */
    private String bookId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 场地编号
     */
    private String siteno;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String stopTime;

    private static final long serialVersionUID = 1L;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSiteno() {
        return siteno;
    }

    public void setSiteno(String siteno) {
        this.siteno = siteno;
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
}