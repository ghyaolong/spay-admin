package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;

public class PayLargeRechargeRecord {
    private String id;

    private String userId;

    private BigDecimal payAccount;

    private Long rechargeDate;

    private String rechargeType;

    private String rechargeWay;

    private String draweeAccountName;

    private String draweeAccount;

    private String currency;

    private String tranfserBank;

    private String remark;

    private String transferOrder;

    private String state;

    private String stateDesc;

    private String auditor;

    private Long auditDate;

    private String reskey;

    private String bankFlow;

    private String isDel;

    private Long delTime;
    
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

	public String getId() {
        return id;
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
        this.rechargeType = rechargeType == null ? null : rechargeType.trim();
    }

    public String getRechargeWay() {
        return rechargeWay;
    }

    public void setRechargeWay(String rechargeWay) {
        this.rechargeWay = rechargeWay == null ? null : rechargeWay.trim();
    }

    public String getDraweeAccountName() {
        return draweeAccountName;
    }

    public void setDraweeAccountName(String draweeAccountName) {
        this.draweeAccountName = draweeAccountName == null ? null : draweeAccountName.trim();
    }

    public String getDraweeAccount() {
        return draweeAccount;
    }

    public void setDraweeAccount(String draweeAccount) {
        this.draweeAccount = draweeAccount == null ? null : draweeAccount.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getTranfserBank() {
        return tranfserBank;
    }

    public void setTranfserBank(String tranfserBank) {
        this.tranfserBank = tranfserBank == null ? null : tranfserBank.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTransferOrder() {
        return transferOrder;
    }

    public void setTransferOrder(String transferOrder) {
        this.transferOrder = transferOrder == null ? null : transferOrder.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
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
        this.reskey = reskey == null ? null : reskey.trim();
    }

    public String getBankFlow() {
        return bankFlow;
    }

    public void setBankFlow(String bankFlow) {
        this.bankFlow = bankFlow == null ? null : bankFlow.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public Long getDelTime() {
        return delTime;
    }

    public void setDelTime(Long delTime) {
        this.delTime = delTime;
    }
}