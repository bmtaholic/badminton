package com.bmtaholic.badminton.entity;

import java.io.Serializable;

/**
 * admin
 * @author 
 */
public class Admin implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getGymnasiumId() {
        return gymnasiumId;
    }

    public void setGymnasiumId(Integer gymnasiumId) {
        this.gymnasiumId = gymnasiumId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}