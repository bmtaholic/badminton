package com.bmtaholic.badminton.entity;

import java.io.Serializable;

/**
 * consume
 * @author 
 */
public class Consume implements Serializable {
    /**
     * 手机号
     */
    private String phone;

    /**
     * 消费时间
     */
    private String consumeTime;

    /**
     * 消费金额
     */
    private String consumeMoney;

    /**
     * 消费类型
     */
    private String consumeType;

    /**
     * 余额
     */
    private String balance;

    /**
     * 名字
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(String consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}