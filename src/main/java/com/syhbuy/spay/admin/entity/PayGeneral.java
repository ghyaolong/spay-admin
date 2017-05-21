package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;

import javax.persistence.Transient;

/**
 * 用户通用代金券 <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016-11-1 下午6:47:54
 * <p>
 * Company: 陕西善友汇网络科技股份有限公司
 * <p>
 * 
 * @author houss
 * @version 1.0.0
 */
public class PayGeneral {

	// 通用券ID
	private String id;

	// 代金券ID
	private String cashCouponId;

	// 来源类别
	private String origin;

	// 来源对象ID
	private String originId;

	// 标题
	private String title;

	// 面额
	private BigDecimal denomination;

	// 余额
	private BigDecimal couponMoney;

	// 生成时间
	private Long generateTime;

	// 启用时间
	private Long enableTime;

	// 失效时间
	private Long disableTime;

	// 用户ID
	private String userId;

	// 券状态
	private String couponSatus;

	// 页面券状态
	private String couponSatusShow;

	private String isDel;

	private Long delTime;

	// 新增字段 10.24(9个字段)
	private Long commonId;

	// 会员ID
	private Long memberId;

	// 所属公司
	private String company;

	// 备注
	private String description;

	// 返券增加时间
	private String addTime; // 添加时间

	// 返券订单号
	private String fanquanOrderNum;

	// 冻结时间
	private String freezeDate;

	private Long fanquanType; // 返券类型

	// 过期时间
	private String overdueDate;

	// 是否冻结
	private Long freezeAlive;

	// 是否过期
	private Long overdueAlive;

	// 返还状态
	private Long isReturn;

	// 返券日期
	private Long fanquanDate;

	// 返券是否可以过期
	private Long isOverdue;

	// 返券唯一标识符
	private Long fanquanId;

	// 与数据库无关；只做页面显示
	@Transient
	private String generateTimeShow;

	@Transient
	private String disableTimeShow;

	@Transient
	private String enableTimeShow;

	@Transient
	private String freezeAliveShow;

	public String getCouponSatusShow() {
		return couponSatusShow;
	}

	public void setCouponSatusShow(String couponSatusShow) {
		this.couponSatusShow = couponSatusShow;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getCashCouponId() {
		return cashCouponId;
	}

	public void setCashCouponId(String cashCouponId) {
		this.cashCouponId = cashCouponId == null ? null : cashCouponId.trim();
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin == null ? null : origin.trim();
	}

	public String getOriginId() {
		return originId;
	}

	public void setOriginId(String originId) {
		this.originId = originId == null ? null : originId.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public BigDecimal getDenomination() {
		return denomination;
	}

	public void setDenomination(BigDecimal denomination) {
		this.denomination = denomination;
	}

	public BigDecimal getCouponMoney() {
		return couponMoney;
	}

	public void setCouponMoney(BigDecimal couponMoney) {
		this.couponMoney = couponMoney;
	}

	public Long getGenerateTime() {
		return generateTime;
	}

	public void setGenerateTime(Long generateTime) {
		this.generateTime = generateTime;
	}

	public Long getEnableTime() {
		return enableTime;
	}

	public void setEnableTime(Long enableTime) {
		this.enableTime = enableTime;
	}

	public Long getDisableTime() {
		return disableTime;
	}

	public void setDisableTime(Long disableTime) {
		this.disableTime = disableTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * 获取 couponSatus
	 * 
	 * @return couponSatus
	 */
	public String getCouponSatus() {
		return couponSatus;
	}

	/**
	 * 设置 couponSatus
	 * 
	 * @param couponSatus
	 *            couponSatus
	 */
	public void setCouponSatus(String couponSatus) {
		this.couponSatus = couponSatus;
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

	public Long getCommonId() {
		return commonId;
	}

	public void setCommonId(Long commonId) {
		this.commonId = commonId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getFanquanOrderNum() {
		return fanquanOrderNum;
	}

	public void setFanquanOrderNum(String fanquanOrderNum) {
		this.fanquanOrderNum = fanquanOrderNum;
	}

	public String getFreezeDate() {
		return freezeDate;
	}

	public void setFreezeDate(String freezeDate) {
		this.freezeDate = freezeDate;
	}

	public Long getFanquanType() {
		return fanquanType;
	}

	public void setFanquanType(Long fanquanType) {
		this.fanquanType = fanquanType;
	}

	public String getOverdueDate() {
		return overdueDate;
	}

	public void setOverdueDate(String overdueDate) {
		this.overdueDate = overdueDate;
	}

	public Long getFreezeAlive() {
		return freezeAlive;
	}

	public void setFreezeAlive(Long freezeAlive) {
		this.freezeAlive = freezeAlive;
	}

	public Long getOverdueAlive() {
		return overdueAlive;
	}

	public void setOverdueAlive(Long overdueAlive) {
		this.overdueAlive = overdueAlive;
	}

	public Long getIsReturn() {
		return isReturn;
	}

	public void setIsReturn(Long isReturn) {
		this.isReturn = isReturn;
	}

	public Long getFanquanDate() {
		return fanquanDate;
	}

	public void setFanquanDate(Long fanquanDate) {
		this.fanquanDate = fanquanDate;
	}

	public Long getIsOverdue() {
		return isOverdue;
	}

	public void setIsOverdue(Long isOverdue) {
		this.isOverdue = isOverdue;
	}

	public Long getFanquanId() {
		return fanquanId;
	}

	public void setFanquanId(Long fanquanId) {
		this.fanquanId = fanquanId;
	}

	/**
	 * 获取 generateTimeShow
	 * 
	 * @return generateTimeShow
	 */
	public String getGenerateTimeShow() {
		return generateTimeShow;
	}

	/**
	 * 设置 generateTimeShow
	 * 
	 * @param generateTimeShow
	 *            generateTimeShow
	 */
	public void setGenerateTimeShow(String generateTimeShow) {
		this.generateTimeShow = generateTimeShow;
	}

	/**
	 * 获取 disableTimeShow
	 * 
	 * @return disableTimeShow
	 */
	public String getDisableTimeShow() {
		return disableTimeShow;
	}

	/**
	 * 设置 disableTimeShow
	 * 
	 * @param disableTimeShow
	 *            disableTimeShow
	 */
	public void setDisableTimeShow(String disableTimeShow) {
		this.disableTimeShow = disableTimeShow;
	}

	/**
	 * 获取 enableTimeShow
	 * 
	 * @return enableTimeShow
	 */
	public String getEnableTimeShow() {
		return enableTimeShow;
	}

	/**
	 * 设置 enableTimeShow
	 * 
	 * @param enableTimeShow
	 *            enableTimeShow
	 */
	public void setEnableTimeShow(String enableTimeShow) {
		this.enableTimeShow = enableTimeShow;
	}

	/**
	 * 获取 freezeAliveShow
	 * 
	 * @return freezeAliveShow
	 */
	public String getFreezeAliveShow() {
		return freezeAliveShow;
	}

	/**
	 * 设置 freezeAliveShow
	 * 
	 * @param freezeAliveShow
	 *            freezeAliveShow
	 */
	public void setFreezeAliveShow(String freezeAliveShow) {
		this.freezeAliveShow = freezeAliveShow;
	}

}