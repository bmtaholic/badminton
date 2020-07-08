package com.bmtaholic.badminton.entity;

import java.io.Serializable;

/**
 * gymnasium
 * @author 
 */
public class Gymnasium implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getGymnasiumId() {
        return gymnasiumId;
    }

    public void setGymnasiumId(Integer gymnasiumId) {
        this.gymnasiumId = gymnasiumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}