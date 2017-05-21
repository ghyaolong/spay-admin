package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;

// 会员余额账户表
public class Balance {

	private String id;// 主键

	private String userId;// 用户ID

	private String phone;// 手机号

	private BigDecimal accountBalance;// 账户余额

	private BigDecimal mycommissions;// 佣金

	public BigDecimal getMycommissions() {
		return mycommissions;
	}

	public void setMycommissions(BigDecimal mycommissions) {
		this.mycommissions = mycommissions;
	}

	public String getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * 获取 accountBalance
	 * 
	 * @return accountBalance
	 */
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	/**
	 * 设置 accountBalance
	 * 
	 * @param accountBalance
	 *            accountBalance
	 */
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Balance() {
		super();
	}

}