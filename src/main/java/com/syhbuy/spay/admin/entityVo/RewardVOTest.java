package com.syhbuy.spay.admin.entityVo;


public class RewardVOTest {

	private String id;//奖励ID

    private String ruleId;//规则ID
    
    private String rewardName;//奖励名

    private Long timeRefType;//时间参考类型

    private Long timeInterval;//时间间隔（天）

    private Long periodCount;//期数

    private String isDel;

    private Long delTime;
    
	private String dataJSON;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataJSON() {
		return dataJSON;
	}

	public void setDataJSON(String dataJSON) {
		this.dataJSON = dataJSON;
	}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public Long getTimeRefType() {
		return timeRefType;
	}

	public void setTimeRefType(Long timeRefType) {
		this.timeRefType = timeRefType;
	}

	public Long getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(Long timeInterval) {
		this.timeInterval = timeInterval;
	}

	public Long getPeriodCount() {
		return periodCount;
	}

	public void setPeriodCount(Long periodCount) {
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

	
}
