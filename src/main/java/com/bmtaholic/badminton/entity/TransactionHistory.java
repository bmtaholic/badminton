package com.bmtaholic.badminton.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * transaction_history
 * @author 
 */
public class TransactionHistory implements Serializable {
    /**
     * 明细编号
     */
    private Integer historyId;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 球馆编号
     */
    private Integer gymId;

    /**
     * 交易类型 1：支出 2：充值
     */
    private Integer type;

    /**
     * 总金额
     */
    private BigDecimal sum;

    /**
     * 实际总金额
     */
    private BigDecimal realSum;

    /**
     * 交易时间
     */
    private String createdAt;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getRealSum() {
        return realSum;
    }

    public void setRealSum(BigDecimal realSum) {
        this.realSum = realSum;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}