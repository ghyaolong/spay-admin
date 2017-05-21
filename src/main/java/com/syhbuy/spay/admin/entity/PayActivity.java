package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;

public class PayActivity {
    private String id;
    //标题
    private String title;
    //返券比例
    private BigDecimal couponScalse;
    //0保存,1已发布，2停用，3已过期
    private String releaseStatus;
    //活动开始时间
    private Long activityBeginTime;
    //活动结束时间
    private Long activityEndTime;
    //券开始时间
    private Long couponBeginTime;
    //券结束时间
    private Long couponEndTime;
    //定向类别
    private String directCategory;
    //定向对象ID
    private String directObjId;
    //规则说明
    private String ruleDesc;
    //活动图展示
    private String icon;
    //购买方式说明
    private String buyTypeDesc;

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
	 * 获取 title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置 title
	 * @param title title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	

	/**
	 * 获取 couponScalse
	 * @return couponScalse
	 */
	public BigDecimal getCouponScalse() {
		
		
		return couponScalse;
	}

	/**
	 * 设置 couponScalse
	 * @param couponScalse couponScalse
	 */
	public void setCouponScalse(BigDecimal couponScalse) {
		this.couponScalse = couponScalse;
	}

	/**
	 * 获取 releaseStatus
	 * @return releaseStatus
	 */
	public String getReleaseStatus() {
		return releaseStatus;
	}

	/**
	 * 设置 releaseStatus
	 * @param releaseStatus releaseStatus
	 */
	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
	}

	/**
	 * 获取 activityBeginTime
	 * @return activityBeginTime
	 */
	public Long getActivityBeginTime() {
		return activityBeginTime;
	}

	/**
	 * 设置 activityBeginTime
	 * @param activityBeginTime activityBeginTime
	 */
	public void setActivityBeginTime(Long activityBeginTime) {
		this.activityBeginTime = activityBeginTime;
	}

	/**
	 * 获取 activityEndTime
	 * @return activityEndTime
	 */
	public Long getActivityEndTime() {
		return activityEndTime;
	}

	/**
	 * 设置 activityEndTime
	 * @param activityEndTime activityEndTime
	 */
	public void setActivityEndTime(Long activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	/**
	 * 获取 couponBeginTime
	 * @return couponBeginTime
	 */
	public Long getCouponBeginTime() {
		return couponBeginTime;
	}

	/**
	 * 设置 couponBeginTime
	 * @param couponBeginTime couponBeginTime
	 */
	public void setCouponBeginTime(Long couponBeginTime) {
		this.couponBeginTime = couponBeginTime;
	}

	/**
	 * 获取 couponEndTime
	 * @return couponEndTime
	 */
	public Long getCouponEndTime() {
		return couponEndTime;
	}

	/**
	 * 设置 couponEndTime
	 * @param couponEndTime couponEndTime
	 */
	public void setCouponEndTime(Long couponEndTime) {
		this.couponEndTime = couponEndTime;
	}

	/**
	 * 获取 directCategory
	 * @return directCategory
	 */
	public String getDirectCategory() {
		return directCategory;
	}

	/**
	 * 设置 directCategory
	 * @param directCategory directCategory
	 */
	public void setDirectCategory(String directCategory) {
		this.directCategory = directCategory;
	}

	/**
	 * 获取 directObjId
	 * @return directObjId
	 */
	public String getDirectObjId() {
		return directObjId;
	}

	/**
	 * 设置 directObjId
	 * @param directObjId directObjId
	 */
	public void setDirectObjId(String directObjId) {
		this.directObjId = directObjId;
	}

	/**
	 * 获取 ruleDesc
	 * @return ruleDesc
	 */
	public String getRuleDesc() {
		return ruleDesc;
	}

	/**
	 * 设置 ruleDesc
	 * @param ruleDesc ruleDesc
	 */
	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	/**
	 * 获取 icon
	 * @return icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置 icon
	 * @param icon icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * 获取 buyTypeDesc
	 * @return buyTypeDesc
	 */
	public String getBuyTypeDesc() {
		return buyTypeDesc;
	}

	/**
	 * 设置 buyTypeDesc
	 * @param buyTypeDesc buyTypeDesc
	 */
	public void setBuyTypeDesc(String buyTypeDesc) {
		this.buyTypeDesc = buyTypeDesc;
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

	public PayActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
  
}