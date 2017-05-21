package com.syhbuy.spay.admin.entity;


public class PayActive {
    private String id;

    private String title;

    private String couponScale;

    private String releaseStatus;
    
	private String activityBeginTime;

    private String activityEndTime;

    private String beginTime;

    private String endTime; 

	private String orientationCategory;

    private String orientationId;

    private String ruleDesc;
    
    private String createTime;
    
    public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public String getDelTime() {
		return delTime;
	}

	public void setDelTime(String delTime) {
		this.delTime = delTime;
	}

	private String icon;
    
    private String isDel;
    
    private String delTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCouponScale() {
		return couponScale;
	}

	public void setCouponScale(String couponScale) {
		this.couponScale = couponScale;
	}

	public String getReleaseStatus() {
		return releaseStatus;
	}

	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
	}

	public String getActivityBeginTime() {
		return activityBeginTime;
	}

	public void setActivityBeginTime(String activityBeginTime) {
		this.activityBeginTime = activityBeginTime;
	}

	public String getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOrientationCategory() {
		return orientationCategory;
	}

	public void setOrientationCategory(String orientationCategory) {
		this.orientationCategory = orientationCategory;
	}

	public String getOrientationId() {
		return orientationId;
	}

	public void setOrientationId(String orientationId) {
		this.orientationId = orientationId;
	}

	public String getRuleDesc() {
		return ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	@Override
	public String toString() {
		return "PayActive [id=" + id + ", title=" + title + ", couponScale="
				+ couponScale + ", releaseStatus=" + releaseStatus
				+ ", activityBeginTime=" + activityBeginTime
				+ ", activityEndTime=" + activityEndTime + ", beginTime="
				+ beginTime + ", endTime=" + endTime + ", orientationCategory="
				+ orientationCategory + ", orientationId=" + orientationId
				+ ", ruleDesc=" + ruleDesc + ", icon=" + icon + ", isDel="
				+ isDel + ", delTime=" + delTime + "]";
	}


    
    
	
   
    
}