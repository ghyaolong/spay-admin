package com.syhbuy.spay.admin.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Transient;

public class AuditSettlement {

	private String id;// 主键

	private String applicationName;// 申请姓名

	private String approvalId;// 审批ID

	private String auditName;// 审批姓名

	private String auditOpinion;// 审批意见

	private String auditResult;// 审批结果

	private Timestamp applicationTime;// 申请时间

	private Timestamp auditTime;// 审核时间

	// 添加字段；与数据库无关；只做页面显示
	@Transient
	private String resgTimeString;
	private String searchStartTime;
	private String searchEndTime;

	private Long startTime;
	private Long endTime;

	
	
	public String getResgTimeString() {
		return resgTimeString;
	}

	public void setResgTimeString(String resgTimeString) {
		this.resgTimeString = resgTimeString;
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

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(String approvalId) {
		this.approvalId = approvalId;
	}

	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public String getAuditOpinion() {
		return auditOpinion;
	}

	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion = auditOpinion;
	}

	public String getAuditResult() {
		return auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public Timestamp getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(Timestamp applicationTime) {
		this.applicationTime = applicationTime;
	}

	public Timestamp getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
	}

}