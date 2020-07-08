package com.bmtaholic.badminton.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * site
 * @author 
 */
public class Site implements Serializable {
    /**
     * 球场编号
     */
    private Integer siteId;

    /**
     * 球馆编号
     */
    private Integer gymnasiumId;

    /**
     * 场地类型
     */
    private Integer type;

    /**
     * 普通价格
     */
    private BigDecimal price;

    /**
     * vip价格
     */
    private BigDecimal vipPrice;

    /**
     * 状态
     */
    private Integer status;
    
    private String siteNo;

	private static final long serialVersionUID = 1L;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getGymnasiumId() {
        return gymnasiumId;
    }

    public void setGymnasiumId(Integer gymnasiumId) {
        this.gymnasiumId = gymnasiumId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(BigDecimal vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getSiteNo() {
		return siteNo;
	}

	public void setSiteNo(String siteNo) {
		this.siteNo = siteNo;
	}
}