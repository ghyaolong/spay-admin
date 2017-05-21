package com.syhbuy.spay.admin.entity;

import java.util.Date;

//用户认证信息表
public class Approve {

	private String id;//ID
	private String realName;//真实姓名
	private String idCard;//身份证号码
	private String isValid;//是否永久有效
	private Date idCardValidBegin;//身份证有效期始
	private Date idCardValidEnd;//身份证有效期至
	private String ceritificationPositivePhoto;//证件正面拍照
	private String holdingPhoto;//手持身份证拍照
	private String ceritiStatus;//认证状态
	private String advice;//状态意见
	private Date adviceTime;//状态时间
	private String userId;//关联user
	private String reverseCertificatePhoto;//证件反面拍照
	public String getId() { 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIsValid() {
		return isValid;
	}
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	public Date getIdCardValidBegin() {
		return idCardValidBegin;
	}
	public void setIdCardValidBegin(Date idCardValidBegin) {
		this.idCardValidBegin = idCardValidBegin;
	}
	public Date getIdCardValidEnd() {
		return idCardValidEnd;
	}
	public void setIdCardValidEnd(Date idCardValidEnd) {
		this.idCardValidEnd = idCardValidEnd;
	}
	public String getCeritificationPositivePhoto() {
		return ceritificationPositivePhoto;
	}
	public void setCeritificationPositivePhoto(String ceritificationPositivePhoto) {
		this.ceritificationPositivePhoto = ceritificationPositivePhoto;
	}
	public String getHoldingPhoto() {
		return holdingPhoto;
	}
	public void setHoldingPhoto(String holdingPhoto) {
		this.holdingPhoto = holdingPhoto;
	}
	public String getCeritiStatus() {
		return ceritiStatus;
	}
	public void setCeritiStatus(String ceritiStatus) {
		this.ceritiStatus = ceritiStatus;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public Date getAdviceTime() {
		return adviceTime;
	}
	public void setAdviceTime(Date adviceTime) {
		this.adviceTime = adviceTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReverseCertificatePhoto() {
		return reverseCertificatePhoto;
	}
	public void setReverseCertificatePhoto(String reverseCertificatePhoto) {
		this.reverseCertificatePhoto = reverseCertificatePhoto;
	}
	public Approve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Approve(String id, String realName, String idCard, String isValid,
			Date idCardValidBegin, Date idCardValidEnd,
			String ceritificationPositivePhoto, String holdingPhoto,
			String ceritiStatus, String advice, Date adviceTime, String userId,
			String reverseCertificatePhoto) {
		super();
		this.id = id;
		this.realName = realName;
		this.idCard = idCard;
		this.isValid = isValid;
		this.idCardValidBegin = idCardValidBegin;
		this.idCardValidEnd = idCardValidEnd;
		this.ceritificationPositivePhoto = ceritificationPositivePhoto;
		this.holdingPhoto = holdingPhoto;
		this.ceritiStatus = ceritiStatus;
		this.advice = advice;
		this.adviceTime = adviceTime;
		this.userId = userId;
		this.reverseCertificatePhoto = reverseCertificatePhoto;
	}

	
}