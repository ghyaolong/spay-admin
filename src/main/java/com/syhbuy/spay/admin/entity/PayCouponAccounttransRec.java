package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;

import javax.persistence.Transient;

public class PayCouponAccounttransRec {
    private String id;
    //交易号
    private String trtanId;
    //代金券ID
    private String couponId;
    //用户ID
    private String userId;
    //交易金额
    private BigDecimal transAmount;
    //交易时间
    private Long tranTime;
    //交易类型0平台充值（+）、1消费（-）、2返券（+）、3过期(-)4、冻结、5、退款、6撤销
    private String tranType;
    //交易状态0 成功 1 失败
    private String tranStatus;
    //描述
    private String describe;
    //代金券类型
    private String couponType;
   
    private String isDel;
   
    private Long delTime;
    //页面显示的交易时间
    @Transient
    private String tranTimeShow;
    
    
    private String searchStartTime;
	private String searchEndTime;
	
	private Long startTime;
	private Long endTime;
	
	
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
	 * 获取 trtanId
	 * @return trtanId
	 */
	public String getTrtanId() {
		return trtanId;
	}

	/**
	 * 设置 trtanId
	 * @param trtanId trtanId
	 */
	public void setTrtanId(String trtanId) {
		this.trtanId = trtanId;
	}

	/**
	 * 获取 couponId
	 * @return couponId
	 */
	public String getCouponId() {
		return couponId;
	}

	/**
	 * 设置 couponId
	 * @param couponId couponId
	 */
	public void setCouponId(String couponId) {
		this.couponId = couponId;
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
	 * 获取 transAmount
	 * @return transAmount
	 */
	public BigDecimal getTransAmount() {
		return transAmount;
	}

	/**
	 * 设置 transAmount
	 * @param transAmount transAmount
	 */
	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}

	/**
	 * 获取 tranTime
	 * @return tranTime
	 */
	public Long getTranTime() {
		return tranTime;
	}

	/**
	 * 设置 tranTime
	 * @param tranTime tranTime
	 */
	public void setTranTime(Long tranTime) {
		this.tranTime = tranTime;
	}

	/**
	 * 获取 tranType
	 * @return tranType
	 */
	public String getTranType() {
		return tranType;
	}

	/**
	 * 设置 tranType
	 * @param tranType tranType
	 */
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	/**
	 * 获取 tranStatus
	 * @return tranStatus
	 */
	public String getTranStatus() {
		return tranStatus;
	}

	/**
	 * 设置 tranStatus
	 * @param tranStatus tranStatus
	 */
	public void setTranStatus(String tranStatus) {
		this.tranStatus = tranStatus;
	}

	/**
	 * 获取 describe
	 * @return describe
	 */
	public String getDescribe() {
		return describe;
	}

	/**
	 * 设置 describe
	 * @param describe describe
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	/**
	 * 获取 couponType
	 * @return couponType
	 */
	public String getCouponType() {
		return couponType;
	}

	/**
	 * 设置 couponType
	 * @param couponType couponType
	 */
	public void setCouponType(String couponType) {
		this.couponType = couponType;
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

	/**
	 * 获取 tranTimeShow
	 * @return tranTimeShow
	 */
	public String getTranTimeShow() {
		return tranTimeShow;
	}

	/**
	 * 设置 tranTimeShow
	 * @param tranTimeShow tranTimeShow
	 */
	public void setTranTimeShow(String tranTimeShow) {
		this.tranTimeShow = tranTimeShow;
	}
	
	
   
}