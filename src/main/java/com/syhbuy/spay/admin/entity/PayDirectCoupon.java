package com.syhbuy.spay.admin.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Transient;

/**
 * @author Administrator 定向券
 */
public class PayDirectCoupon {

	private String id;

	private String cashCouponId;

	private String origin;

	private String originId;

	private String title;

	private String denomination;

	private BigDecimal couponMoney;

	private Long generateTime;

	private Long enableTime;

	private Long disableTime;

	private String directCategory;

	private String directObjId;

	private String userId;

	private String couponSatus;

	private String isDel;

	private Long delTime;

	// 给店铺起的名字
	private String directObjIdName;

	// 给品类起的名字
	private String categoryName;

	private List<String> list;

	// 10.24 新增12个字段
	private Long commonId; // 公共属性ID

	private Long memberId; // 会员ID

	private Long fanquanType;// 返券类型

	private Long fanquanDate; // 返券日期

	private String fanquanOrderNum;// 返券订单号

	private Long freezeAlive; // 冻结状态

	private String company;

	private String description;

	private String addTime; // 添加时间

	private Long isBeeak;

	private Long fanquanFlag;

	private String freezeDate;

	private String overdueDate;

	private Long overdueAlive;

	private Long isReturn;

	private Long isOverdue;

	private String directObjId2;

	private String directObjId3;

	private Long fanquanId;

	private String directObjId1Name;

	private String directObjId2Name;

	private String directObjId3Name;

	private String couponStatus;

	public String getCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	// 做页面显示时间的字段
	@Transient
	private String searchStartTime = "";

	@Transient
	private String searchEndTime = "";

	@Transient
	private String searchTime = "";

	@Transient
	private Long startTime;

	@Transient
	private Long endTime;

	@Transient
	private Long Time;

	@Transient
	private String enableTimeShow = "";

	@Transient
	private String disableTimeShow = "";

	private String freezeAliveShow; // 冻结状态

	private String couponSatusShow;

	public String getCouponSatusShow() {
		return couponSatusShow;
	}

	public void setCouponSatusShow(String couponSatusShow) {
		this.couponSatusShow = couponSatusShow;
	}

	public String getFreezeAliveShow() {
		return freezeAliveShow;
	}

	public void setFreezeAliveShow(String freezeAliveShow) {
		this.freezeAliveShow = freezeAliveShow;
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

	public String getSearchTime() {
		return searchTime;
	}

	public void setSearchTime(String searchTime) {
		this.searchTime = searchTime;
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

	public Long getTime() {
		return Time;
	}

	public void setTime(Long time) {
		Time = time;
	}

	/**
	 * 获取 list
	 * 
	 * @return list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * 设置 list
	 * 
	 * @param list
	 *            list
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * 获取 directObjIdName
	 * 
	 * @return directObjIdName
	 */
	public String getDirectObjIdName() {
		return directObjIdName;
	}

	/**
	 * 设置 directObjIdName
	 * 
	 * @param directObjIdName
	 *            directObjIdName
	 */
	public void setDirectObjIdName(String directObjIdName) {
		this.directObjIdName = directObjIdName;
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

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination == null ? null : denomination.trim();
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

	public String getDirectCategory() {
		return directCategory;
	}

	public void setDirectCategory(String directCategory) {
		this.directCategory = directCategory == null ? null : directCategory.trim();
	}

	public String getDirectObjId() {
		return directObjId;
	}

	public void setDirectObjId(String directObjId) {
		this.directObjId = directObjId == null ? null : directObjId.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getCouponSatus() {
		return couponSatus;
	}

	public void setCouponSatus(String couponSatus) {
		this.couponSatus = couponSatus == null ? null : couponSatus.trim();
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

	/**
	 * 获取 categoryName
	 * 
	 * @return categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * 设置 categoryName
	 * 
	 * @param categoryName
	 *            categoryName
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getOverdueDate() {
		return overdueDate;
	}

	public void setOverdueDate(String overdueDate) {
		this.overdueDate = overdueDate;
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

	public Long getIsOverdue() {
		return isOverdue;
	}

	public void setIsOverdue(Long isOverdue) {
		this.isOverdue = isOverdue;
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

	public Long getFanquanType() {
		return fanquanType;
	}

	public void setFanquanType(Long fanquanType) {
		this.fanquanType = fanquanType;
	}

	public Long getFanquanDate() {
		return fanquanDate;
	}

	public void setFanquanDate(Long fanquanDate) {
		this.fanquanDate = fanquanDate;
	}

	public String getFanquanOrderNum() {
		return fanquanOrderNum;
	}

	public void setFanquanOrderNum(String fanquanOrderNum) {
		this.fanquanOrderNum = fanquanOrderNum;
	}

	public Long getFreezeAlive() {
		return freezeAlive;
	}

	public void setFreezeAlive(Long freezeAlive) {
		this.freezeAlive = freezeAlive;
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

	public Long getIsBeeak() {
		return isBeeak;
	}

	public void setIsBeeak(Long isBeeak) {
		this.isBeeak = isBeeak;
	}

	public Long getFanquanFlag() {
		return fanquanFlag;
	}

	public void setFanquanFlag(Long fanquanFlag) {
		this.fanquanFlag = fanquanFlag;
	}

	public String getFreezeDate() {
		return freezeDate;
	}

	public void setFreezeDate(String freezeDate) {
		this.freezeDate = freezeDate;
	}

	public String getDirectObjId2() {
		return directObjId2;
	}

	public void setDirectObjId2(String directObjId2) {
		this.directObjId2 = directObjId2;
	}

	public String getDirectObjId3() {
		return directObjId3;
	}

	public void setDirectObjId3(String directObjId3) {
		this.directObjId3 = directObjId3;
	}

	public Long getFanquanId() {
		return fanquanId;
	}

	public void setFanquanId(Long fanquanId) {
		this.fanquanId = fanquanId;
	}

	public String getDirectObjId1Name() {
		return directObjId1Name;
	}

	public void setDirectObjId1Name(String directObjId1Name) {
		this.directObjId1Name = directObjId1Name;
	}

	public String getDirectObjId2Name() {
		return directObjId2Name;
	}

	public void setDirectObjId2Name(String directObjId2Name) {
		this.directObjId2Name = directObjId2Name;
	}

	public String getDirectObjId3Name() {
		return directObjId3Name;
	}

	public void setDirectObjId3Name(String directObjId3Name) {
		this.directObjId3Name = directObjId3Name;
	}

	public PayDirectCoupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEnableTimeShow() {
		return enableTimeShow;
	}

	public void setEnableTimeShow(String enableTimeShow) {
		this.enableTimeShow = enableTimeShow;
	}

	public String getDisableTimeShow() {
		return disableTimeShow;
	}

	public void setDisableTimeShow(String disableTimeShow) {
		this.disableTimeShow = disableTimeShow;
	}

	public PayDirectCoupon(String id, String cashCouponId, String origin, String originId, String title, String denomination, BigDecimal couponMoney,
	                       Long generateTime, Long enableTime, Long disableTime, String directCategory, String directObjId, String userId,
	                       String couponSatus, String isDel, Long delTime, String directObjIdName, String categoryName, List<String> list,
	                       Long commonId, Long memberId, Long fanquanType, Long fanquanDate, String fanquanOrderNum, Long freezeAlive,
	                       String company, String description, String addTime, Long isBeeak, Long fanquanFlag, String freezeDate, String overdueDate,
	                       Long overdueAlive, Long isReturn, Long isOverdue, String directObjId2, String directObjId3, Long fanquanId,
	                       String directObjId1Name, String directObjId2Name, String directObjId3Name) {
		super();
		this.id = id;
		this.cashCouponId = cashCouponId;
		this.origin = origin;
		this.originId = originId;
		this.title = title;
		this.denomination = denomination;
		this.couponMoney = couponMoney;
		this.generateTime = generateTime;
		this.enableTime = enableTime;
		this.disableTime = disableTime;
		this.directCategory = directCategory;
		this.directObjId = directObjId;
		this.userId = userId;
		this.couponSatus = couponSatus;
		this.isDel = isDel;
		this.delTime = delTime;
		this.directObjIdName = directObjIdName;
		this.categoryName = categoryName;
		this.list = list;
		this.commonId = commonId;
		this.memberId = memberId;
		this.fanquanType = fanquanType;
		this.fanquanDate = fanquanDate;
		this.fanquanOrderNum = fanquanOrderNum;
		this.freezeAlive = freezeAlive;
		this.company = company;
		this.description = description;
		this.addTime = addTime;
		this.isBeeak = isBeeak;
		this.fanquanFlag = fanquanFlag;
		this.freezeDate = freezeDate;
		this.overdueDate = overdueDate;
		this.overdueAlive = overdueAlive;
		this.isReturn = isReturn;
		this.isOverdue = isOverdue;
		this.directObjId2 = directObjId2;
		this.directObjId3 = directObjId3;
		this.fanquanId = fanquanId;
		this.directObjId1Name = directObjId1Name;
		this.directObjId2Name = directObjId2Name;
		this.directObjId3Name = directObjId3Name;
	}

}
