package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;

public class DispenseRechargeRecord {

	private String id;

    private String buyId;

    private String userId;

    private String accountId;

    private String dispenseId;

    private BigDecimal denomination;

    private BigDecimal couponBalance;

    private Long generateTime;

    private Long couponBeginTime;

    private Long couponEndTime;

    private String directCategory;

    private String directId;

    private String state;

    private String enableState;

    private String isDel;

    private Long delTime;
    
    private String orderId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuyId() {
		return buyId;
	}

	public void setBuyId(String buyId) {
		this.buyId = buyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getDispenseId() {
		return dispenseId;
	}

	public void setDispenseId(String dispenseId) {
		this.dispenseId = dispenseId;
	}

	public BigDecimal getDenomination() {
		return denomination;
	}

	public void setDenomination(BigDecimal denomination) {
		this.denomination = denomination;
	}

	public BigDecimal getCouponBalance() {
		return couponBalance;
	}

	public void setCouponBalance(BigDecimal couponBalance) {
		this.couponBalance = couponBalance;
	}

	public Long getGenerateTime() {
		return generateTime;
	}

	public void setGenerateTime(Long generateTime) {
		this.generateTime = generateTime;
	}

	public Long getCouponBeginTime() {
		return couponBeginTime;
	}

	public void setCouponBeginTime(Long couponBeginTime) {
		this.couponBeginTime = couponBeginTime;
	}

	public Long getCouponEndTime() {
		return couponEndTime;
	}

	public void setCouponEndTime(Long couponEndTime) {
		this.couponEndTime = couponEndTime;
	}

	public String getDirectCategory() {
		return directCategory;
	}

	public void setDirectCategory(String directCategory) {
		this.directCategory = directCategory;
	}

	public String getDirectId() {
		return directId;
	}

	public void setDirectId(String directId) {
		this.directId = directId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEnableState() {
		return enableState;
	}

	public void setEnableState(String enableState) {
		this.enableState = enableState;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public Long getDelTime() {
		return delTime;
	}

	public void setDelTime(Long delTime) {
		this.delTime = delTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
    
    
}
