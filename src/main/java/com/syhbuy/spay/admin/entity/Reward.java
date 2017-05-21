package com.syhbuy.spay.admin.entity;

public class Reward {

	private String id;// 奖励ID

	private String ruleId;// 规则ID

	private int timeRefType;// 时间参考类型

	private int rewardType;

	private int timeInterval;// 时间间隔（天）

	private int periodCount;// 期数

	private String isDel;

	private Long delTime;

	private String rewardName;// 奖励名

	private Long amount; // 数量

	private Long price; // 金额

	private char disable; // 状态

	private String extendType; // 类型

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public char getDisable() {
		return disable;
	}

	public void setDisable(char disable) {
		this.disable = disable;
	}

	public String getExtendType() {
		return extendType;
	}

	public void setExtendType(String extendType) {
		this.extendType = extendType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public int getTimeRefType() {
		return timeRefType;
	}

	public void setTimeRefType(int timeRefType) {
		this.timeRefType = timeRefType;
	}

	public int getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(int timeInterval) {
		this.timeInterval = timeInterval;
	}

	public int getPeriodCount() {
		return periodCount;
	}

	public void setPeriodCount(int periodCount) {
		this.periodCount = periodCount;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public Long getDelTime() {
		return delTime;
	}

	public void setDelTime(Long delTime) {
		this.delTime = delTime;
	}

	public String getRewardName() {
		return rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public Reward() {
		super();
		// TODO Auto-generated constructor stub
	}

}