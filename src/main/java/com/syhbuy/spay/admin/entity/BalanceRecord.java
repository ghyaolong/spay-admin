package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;

import javax.persistence.Transient;

public class BalanceRecord {

	private String id;// 主键

	private String balanceId;// 余额账户ID

	private String userId;// 用户ID

	private String tranId;// 交易号

	private BigDecimal amount;// 金额

	private String condition;// 交易类型

	private BigDecimal beforeChangBlance;// 变动前总额

	private BigDecimal afterChangeBlance;// 变动后总额

	private String transactionState;// 交易状态

	private Long createDate; // 创建时间

	private Long updateDate;// 修改时间

	private String businessFlow;// 业务流水

	private String phone;

	private String loginType;

	// 页面显示的时间
	@Transient
	private String createDateShow;

	@Transient
	private String updateDateShow;

	private String searchStartTime;

	private String searchEndTime;

	private Long startTime;

	private Long endTime;

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSearchStartTime() {
		return searchStartTime;
	}

	public void setSearchStartTime(String searchStartTime) {
		this.searchStartTime = searchStartTime;
	}

	public String getSearchEndTime() {
		return searchEndTime;
	}

	public void setSearchEndTime(String searchEndTime) {
		this.searchEndTime = searchEndTime;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBalanceId() {
		return balanceId;
	}

	public void setBalanceId(String balanceId) {
		this.balanceId = balanceId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public BigDecimal getBeforeChangBlance() {
		return beforeChangBlance;
	}

	public void setBeforeChangBlance(BigDecimal beforeChangBlance) {
		this.beforeChangBlance = beforeChangBlance;
	}

	public BigDecimal getAfterChangeBlance() {
		return afterChangeBlance;
	}

	public void setAfterChangeBlance(BigDecimal afterChangeBlance) {
		this.afterChangeBlance = afterChangeBlance;
	}

	public String getTransactionState() {
		return transactionState;
	}

	public void setTransactionState(String transactionState) {
		this.transactionState = transactionState;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public Long getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Long updateDate) {
		this.updateDate = updateDate;
	}

	public String getBusinessFlow() {
		return businessFlow;
	}

	public void setBusinessFlow(String businessFlow) {
		this.businessFlow = businessFlow;
	}

	public BalanceRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BalanceRecord(String id, String balanceId, String userId, String tranId, BigDecimal amount, String condition, BigDecimal beforeChangBlance, BigDecimal afterChangeBlance, String transactionState, Long createDate, Long updateDate, String businessFlow) {
		super();
		this.id = id;
		this.balanceId = balanceId;
		this.userId = userId;
		this.tranId = tranId;
		this.amount = amount;
		this.condition = condition;
		this.beforeChangBlance = beforeChangBlance;
		this.afterChangeBlance = afterChangeBlance;
		this.transactionState = transactionState;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.businessFlow = businessFlow;
	}

	/**
	 * 获取 createDateShow
	 * 
	 * @return createDateShow
	 */
	public String getCreateDateShow() {
		return createDateShow;
	}

	/**
	 * 设置 createDateShow
	 * 
	 * @param createDateShow
	 *            createDateShow
	 */
	public void setCreateDateShow(String createDateShow) {
		this.createDateShow = createDateShow;
	}

	/**
	 * 获取 updateDateShow
	 * 
	 * @return updateDateShow
	 */
	public String getUpdateDateShow() {
		return updateDateShow;
	}

	/**
	 * 设置 updateDateShow
	 * 
	 * @param updateDateShow
	 *            updateDateShow
	 */
	public void setUpdateDateShow(String updateDateShow) {
		this.updateDateShow = updateDateShow;
	}

}