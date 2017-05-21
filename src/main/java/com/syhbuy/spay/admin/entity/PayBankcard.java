package com.syhbuy.spay.admin.entity;

public class PayBankcard {
	private String id;

	private String bankcard; // 银行卡号

	private String idCard;// 身份证号

	private String openingBank;// 维护银行字典

	private String tel;// 预留手机号

	private String userId;

	private String isDel;

	private Long delTime;

	/**
	 * 获取 id
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置 id
	 * @param id id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取 bankcard
	 * @return bankcard
	 */
	public String getBankcard() {
		return bankcard;
	}

	/**
	 * 设置 bankcard
	 * @param bankcard bankcard
	 */
	public void setBankcard(String bankcard) {
		this.bankcard = bankcard;
	}

	/**
	 * 获取 idCard
	 * @return idCard
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * 设置 idCard
	 * @param idCard idCard
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	/**
	 * 获取 openingBank
	 * @return openingBank
	 */
	public String getOpeningBank() {
		return openingBank;
	}

	/**
	 * 设置 openingBank
	 * @param openingBank openingBank
	 */
	public void setOpeningBank(String openingBank) {
		this.openingBank = openingBank;
	}

	/**
	 * 获取 tel
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * 设置 tel
	 * @param tel tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * 获取 userId
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 设置 userId
	 * @param userId userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 获取 isDel
	 * @return isDel
	 */
	public String getIsDel() {
		return isDel;
	}

	/**
	 * 设置 isDel
	 * @param isDel isDel
	 */
	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	/**
	 * 获取 delTime
	 * @return delTime
	 */
	public Long getDelTime() {
		return delTime;
	}

	/**
	 * 设置 delTime
	 * @param delTime delTime
	 */
	public void setDelTime(Long delTime) {
		this.delTime = delTime;
	}

	
}