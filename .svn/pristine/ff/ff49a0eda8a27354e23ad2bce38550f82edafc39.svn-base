package com.syhbuy.spay.admin.entity;

import java.sql.Timestamp;

import javax.persistence.Transient;

public class OrderHundler {

	private String id;// 主键

	private String orderId;// 订单id

	private String orderStatus;// 订单状态（0默认，1待更新，2成功）

	private String userId;// 用户ID

	private Long delTime;// 删除时间

	private String isDel;// 0:正常 1：删除

	private String userName; // 用户昵称

	private String realName;// 真实姓名

	private Timestamp createTime;// 创建时间

	// 添加字段；与数据库无关；只做页面显示
	@Transient
	private String resgTimeString;

	private String searchStartTime;

	private String searchEndTime;

	private Long startTime;

	private Long endTime;

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

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

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getDelTime() {
		return delTime;
	}

	public void setDelTime(Long delTime) {
		this.delTime = delTime;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public OrderHundler() {
		super();

	}

	public OrderHundler(String id, String orderId, String orderStatus, String userId, Long delTime, String isDel, String userName) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.userId = userId;
		this.delTime = delTime;
		this.isDel = isDel;
		this.userName = userName;
	}

}
