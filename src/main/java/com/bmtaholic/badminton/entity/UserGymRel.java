package com.bmtaholic.badminton.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * user_gym_rel
 * @author 
 */
public class UserGymRel implements Serializable {
    /**
     * 用户编号
     */
    private String userId;

    /**
     * 球馆编号
     */
    private Integer gymId;

    /**
     * 是否VIP
     */
    private Integer isVip;

    /**
     * 加入球馆时间
     */
    private String createdAt;

    /**
     * 最后消费时间
     */
    private String latestConsume;

    /**
     * 积分
     */
    private Integer integration;

    /**
     * 余额
     */
    private BigDecimal balance;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getGymId() {
        return gymId;
    }

    public void setGymId(Integer gymId) {
        this.gymId = gymId;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLatestConsume() {
        return latestConsume;
    }

    public void setLatestConsume(String latestConsume) {
        this.latestConsume = latestConsume;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}