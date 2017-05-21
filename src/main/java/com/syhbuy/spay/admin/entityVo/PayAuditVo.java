package com.syhbuy.spay.admin.entityVo;

import java.math.BigDecimal;

import javax.persistence.Transient;


public class PayAuditVo {

	private String id;// ID
	private String userId;// 用户ID
	private BigDecimal payAccount;// 充值金额
	private Long rechargeDate;// 充值时间
	private String rechargeType;// 充值类型
	private String rechargeWay;// 充值方式
	private String draweeAccountName;// 付款账户名称
	private String draweeAccount;// 付款账号
	private String currency;// 币种
	private String tranfserBank;// 转账银行
	private String remark;// 备注
	private String transferOrder;// 转账单
	private String state;// 状态
	private String stateDesc;// 状态说明
	private String auditor;// 操作人
	private Long auditDate;// 审核时间
	private String reskey;//业务ID
	private String bankFlow;//银行流水号
	private String userName; // 昵称
	private String phone;// 绑定手机Phone
	private String realName;// 真实姓名
	
	private String searchStartTime;
	private String searchEndTime;
	
	private Long startTime;
	private Long endTime;
	
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
	//添加字段；与数据库无关；只做页面显示
	@Transient
	private String resgTimeString;
	
		
	public String getResgTimeString() {
		return resgTimeString;
	}
	public void setResgTimeString(String resgTimeString) {
		this.resgTimeString = resgTimeString;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public BigDecimal getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(BigDecimal payAccount) {
		this.payAccount = payAccount;
	}
	public Long getRechargeDate() {
		return rechargeDate;
	}
	public void setRechargeDate(Long rechargeDate) {
		this.rechargeDate = rechargeDate;
	}
	public String getRechargeType() {
		return rechargeType;
	}
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}
	public String getRechargeWay() {
		return rechargeWay;
	}
	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}
	public String getDraweeAccountName() {
		return draweeAccountName;
	}
	public void setDraweeAccountName(String draweeAccountName) {
		this.draweeAccountName = draweeAccountName;
	}
	public String getDraweeAccount() {
		return draweeAccount;
	}
	public void setDraweeAccount(String draweeAccount) {
		this.draweeAccount = draweeAccount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTranfserBank() {
		return tranfserBank;
	}
	public void setTranfserBank(String tranfserBank) {
		this.tranfserBank = tranfserBank;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTransferOrder() {
		return transferOrder;
	}
	public void setTransferOrder(String transferOrder) {
		this.transferOrder = transferOrder;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStateDesc() {
		return stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public Long getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Long auditDate) {
		this.auditDate = auditDate;
	}
	public String getReskey() {
		return reskey;
	}
	public void setReskey(String reskey) {
		this.reskey = reskey;
	}
	public String getBankFlow() {
		return bankFlow;
	}
	public void setBankFlow(String bankFlow) {
		this.bankFlow = bankFlow;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public PayAuditVo(String id, String userId, BigDecimal payAccount,
			Long rechargeDate, String rechargeType, String rechargeWay,
			String draweeAccountName, String draweeAccount, String currency,
			String tranfserBank, String remark, String transferOrder,
			String state, String stateDesc, String auditor, Long auditDate,
			String reskey, String bankFlow, String userName, String phone,
			String realName) {
		super();
		this.id = id;
		this.userId = userId;
		this.payAccount = payAccount;
		this.rechargeDate = rechargeDate;
		this.rechargeType = rechargeType;
		this.rechargeWay = rechargeWay;
		this.draweeAccountName = draweeAccountName;
		this.draweeAccount = draweeAccount;
		this.currency = currency;
		this.tranfserBank = tranfserBank;
		this.remark = remark;
		this.transferOrder = transferOrder;
		this.state = state;
		this.stateDesc = stateDesc;
		this.auditor = auditor;
		this.auditDate = auditDate;
		this.reskey = reskey;
		this.bankFlow = bankFlow;
		this.userName = userName;
		this.phone = phone;
		this.realName = realName;
	}
	public PayAuditVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
